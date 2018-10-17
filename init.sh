#!/bin/bash
#--------------------------------------------------------------------------------------------------
# Init v0.1 by Roel Beun
#--------------------------------------------------------------------------------------------------

#echo provisioned date
date > /etc/vagrant_provisioned_at

#update system
echo INIT SCRIPT Doing a yum update...
#sudo yum update -y

#install default packages
echo INIT SCRIPT Installing default packages...
#sudo yum install kernel-headers gcc -y
sudo yum install net-tools wget nano kernel-devel mlocate ntp ntpdate ntp-doc -y
sudo yum group install "Development Tools" -y
sudo yum install numactl
sudo yum install libaio
sudo yum install java-1.8.0-openjdk -y

#updatedb for mlocate
echo INIT SCRIPT Running updatedb for mlocate...
sudo updatedb

#set NTP
chkconfig ntpd on
service ntpd stop
ntpdate time.nist.gov
service ntpd start

#Install VBoxGuestAdditions (OBSOLETE, use: vagrant plugin install vagrant-vbguest)
#cd /opt
#sudo wget http://download.virtualbox.org/virtualbox/5.1.26/VBoxGuestAdditions_5.1.26.iso
#sudo mkdir /media/VBoxGuestAdditions
#sudo mount -o loop,ro VBoxGuestAdditions_5.1.26.iso /media/VBoxGuestAdditions
#sudo sh /media/VBoxGuestAdditions/VBoxLinuxAdditions.run
#sudo rm -fr /opt/VBoxGuestAdditions_5.1.26
#sudo umount /media/VBoxGuestAdditions
#sudo rmdir /media/VBoxGuestAdditions
