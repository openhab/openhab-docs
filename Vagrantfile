# -*- mode: ruby -*-
# vi: set ft=ruby :

$script = <<SCRIPT
sudo apt-get update
sudo apt-get install -y build-essential nodejs python-software-properties zlib1g-dev dos2unix
sudo add-apt-repository -y ppa:git-core/ppa
sudo apt-add-repository -y ppa:brightbox/ruby-ng
sudo apt-get update
sudo apt-get install -y git ruby2.2 ruby2.2-dev
sudo gem install directory_watcher bundler
sudo gem install github-pages -V --no-ri --no-rdoc
## For update-external-resources.sh
# sudo apt-get install -y maven
## For update-code-checkers.sh
# curl -sL https://deb.nodesource.com/setup_8.x | sudo -E bash -
# sudo apt-get install -y nodejs
# sudo apt-get install -y linkchecker
rm -rf /srv/website/_site
SCRIPT

Vagrant.configure("2") do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.network "forwarded_port", guest: 4000, host: 4000
  config.vm.synced_folder ".", "/srv/website", create: true
  config.vm.provision "shell", inline: $script
  config.vm.provision "shell", run: "always", inline: "cd /srv/website && jekyll serve --force_polling --incremental --host 0.0.0.0"
end
