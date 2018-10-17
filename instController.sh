#!/bin/bash
#--------------------------------------------------------------------------------------------------
# Install Controller v0.1 by Roel Beun
#--------------------------------------------------------------------------------------------------
cp /vagrant/local.conf /etc/fonts/local.conf
chmod 755 /etc/fonts/local.conf

hostName=`hostname`
sed -i -- "s/hostname/$hostName/g" /vagrant/PeBe_01.varfile
sed -i -- "s/hostname/$hostName/g" /vagrant/ec.response

#/vagrant/controller_64bit_linux*.sh -q -varfile /vagrant/PeBe_01.varfile

#cp /vagrant/license.lic /appl/apm/AppDynamics/Controller

chmod 755 /vagrant/platform-setup-x64-linux*.sh

/vagrant/platform-setup-x64-linux*.sh -q -varfile /vagrant/ec.response

sed -i -- "s/controller_min_ram_in_mb = 3 \* 1024/controller_min_ram_in_mb = 1 \* 1024/g" /opt/appdynamics/platform/platform-admin/archives/controller/4.*/playbooks/controller-demo.groovy
sed -i -- "s/controller_data_min_disk_space_in_mb = 50 \* 1024/controller_data_min_disk_space_in_mb = 1 \* 1024/g" /opt/appdynamics/platform/platform-admin/archives/controller/4.*/playbooks/controller-demo.groovy
sed -i -- "s/controller_min_cpus = 2/controller_min_cpus = 1/g" /opt/appdynamics/platform/platform-admin/archives/controller/4.*/playbooks/controller-demo.groovy

/opt/appdynamics/platform/platform-admin/bin/platform-admin.sh login --user-name admin --password welcome

/opt/appdynamics/platform/platform-admin/bin/platform-admin.sh create-platform --name myTest --installation-dir /opt/appdynamics/
# NOTE: Beginning in 4.5, we will deprecate the alias "platformadmin". Using localhost is equivalent.
/opt/appdynamics/platform/platform-admin/bin/platform-admin.sh add-hosts --hosts platformadmin

/opt/appdynamics/platform/platform-admin/bin/platform-admin.sh submit-job --service controller --job install --args controllerPrimaryHost=platformadmin controllerAdminUsername=admin controllerAdminPassword=admin controllerRootUserPassword=admin mysqlRootPassword=admin


cp /vagrant/license.lic /opt/appdynamics/controller



