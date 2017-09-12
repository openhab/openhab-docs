
$script = <<SCRIPT
sudo apt-get update
sudo apt-get install -y build-essential nodejs python-software-properties
sudo add-apt-repository -y ppa:git-core/ppa
sudo apt-add-repository -y ppa:brightbox/ruby-ng
sudo apt-get update
sudo apt-get install -y git ruby2.2 ruby2.2-dev
sudo gem install directory_watcher
sudo gem install github-pages -V --no-ri --no-rdoc
#sudo apt-get install -y maven
SCRIPT

Vagrant.configure("2") do |config|

  config.vm.box = "JekyllVM"
  config.vm.box_url = "http://files.vagrantup.com/precise32.box"
  config.vm.network "forwarded_port", guest: 4000, host: 4000
  config.vm.synced_folder ".", "/srv/website", create: true
  config.vm.provision "shell", inline: $script
  config.vm.provision "shell", inline: "cd /srv/website && jekyll serve --watch --incremental --force_polling --host 0.0.0.0", run: "always"
end
