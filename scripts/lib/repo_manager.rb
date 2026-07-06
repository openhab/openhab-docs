# frozen_string_literal: true

require "fileutils"

# RepoManager handles downloading and updating external Git repositories.
#
# It is used by the central orchestrator fetch-external-docs.rb script
# to keep all related external openHAB projects (like openhab-addons,
# openhab-webui, etc.) cloned and fetched inside a target_dir.
#
# All git operations are executed quietly (redirecting stdout to null)
# and the script aborts immediately if any git command returns a non-zero exit status.
module RepoManager
  def self.run_git_cmd(*args)
    success = system(*args, out: File::NULL)
    unless success
      warn "  ⚠️ Git command failed: #{args.join(' ')}"
      raise "Git command failed: #{args.join(' ')}"
    end
  end

  def self.pull_or_clone_repo(target_dir, repo_path, branch)
    repo_url = "https://github.com/#{repo_path}"
    name = File.basename(target_dir)

    if Dir.exist?(target_dir)
      puts "  Updating repository '#{name}'..."
      # Fetch origin quietly
      run_git_cmd("git", "-C", target_dir, "fetch", "-q", "origin")
      # Checkout branch quietly
      run_git_cmd("git", "-C", target_dir, "checkout", "-q", branch)
      # Pull branch quietly
      run_git_cmd("git", "-C", target_dir, "pull", "-q")
      puts "  ✔ Updated repository '#{name}'"
    else
      puts "📥Cloning repository '#{name}' (branch: #{branch})..."
      # Ensure parent directory exists
      FileUtils.mkdir_p(File.dirname(target_dir))
      # Clone the repository quietly
      run_git_cmd("git", "clone", "-q", "--depth", "1", "--branch", branch, repo_url, target_dir)
      puts "  ✔ Cloned repository '#{name}' (branch: #{branch})"
    end
  end
end
