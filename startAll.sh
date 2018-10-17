#!/bin/bash
#--------------------------------------------------------------------------------------------------
# start allllllll
#--------------------------------------------------------------------------------------------------



/opt/appdynamics/platform/platform-admin/bin/platform-admin.sh start-platform-admin
/opt/appdynamics/controller/bin/startController.sh

#set key

function jsonValue() {
KEY=$1
num=$2
awk -F"[,:}]" '{for(i=1;i<=NF;i++){if($i~/'$KEY'\042/){print $(i+1)}}}' | tr -d '"' | sed -n ${num}p
}

newAgentKey=`curl -u root@system:admin -X GET http://localhost:8090/controller/api/accounts/accountinfo?accountname=customer1 | jsonValue accessKey 1`

#newAgentKey=458616ce-38da-49bb-b958-236d2c7ea9ee

sed -i -- "s/baa36e27-7c72-4ea0-8b64-3394594c0033/${newAgentKey// /}/g" /vagrant/federationApps/apache-upstream2/bin/catalina.sh
sed -i -- "s/baa36e27-7c72-4ea0-8b64-3394594c0033/${newAgentKey// /}/g" /vagrant/federationApps/apache-upstream/bin/catalina.sh
sed -i -- "s/baa36e27-7c72-4ea0-8b64-3394594c0033/${newAgentKey// /}/g" /vagrant/federationApps/apache-downstream/bin/catalina.sh


#start the servers
nohup /vagrant/federationApps/apache-upstream2/bin/catalina.sh start &
nohup /vagrant/federationApps/apache-upstream/bin/catalina.sh start &
nohup /vagrant/federationApps/apache-downstream/bin/catalina.sh start &

 #while true; do curl http://localhost:8093/fibClientApp/fibClient?fib=23 >/dev/null 2>&1; curl http://localhost:8095/fibClientApp/fibClient?fib=23 >/dev/null 2>&1; done
