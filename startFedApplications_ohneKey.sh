#!/bin/bash
#--------------------------------------------------------------------------------------------------
# set CrossApplication Application config
#--------------------------------------------------------------------------------------------------

#set key




#start the servers
nohup /vagrant/federationApps/apache-upstream2/bin/catalina.sh start &
nohup /vagrant/federationApps/apache-upstream/bin/catalina.sh start &
nohup /vagrant/federationApps/apache-downstream/bin/catalina.sh start &

 #while true; do curl http://localhost:8093/fibClientApp/fibClient?fib=23 >/dev/null 2>&1; curl http://localhost:8095/fibClientApp/fibClient?fib=23 >/dev/null 2>&1; done
