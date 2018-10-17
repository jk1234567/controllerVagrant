##
#!/bin/bash

./stopAll.sh
nohup java -Xmx64m -Xms64m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Server -Dappdynamics.agent.nodeName=TPV_Server_1 -Dappdynamics.agent.applicationName=TPV -jar TPVServer.jar > TPVServer.log &
nohup java -Xmx64m -Xms64m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Auth_Server -Dappdynamics.agent.nodeName=TPV_Auth_Server_1 -Dappdynamics.agent.applicationName=TPV -jar TPVAuthServer.jar > TPVAuthServer.log &

nohup java -Dtpv.centro=Madrid_Sur -Xmx32m -Xms32m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Madrid_Sur -Dappdynamics.agent.nodeName=Madrid_Sur_1 -Dappdynamics.agent.applicationName=TPV -jar TPVClient.jar &
nohup java -Dtpv.centro=Madrid_Sur -Xmx32m -Xms32m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Madrid_Sur -Dappdynamics.agent.nodeName=Madrid_Sur_2 -Dappdynamics.agent.applicationName=TPV -jar TPVClient.jar &

nohup java -Dtpv.centro=Madrid_Centro -Xmx32m -Xms32m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Madrid_Centro -Dappdynamics.agent.nodeName=Madrid_Centro_1 -Dappdynamics.agent.applicationName=TPV -jar TPVClient.jar &
nohup java -Dtpv.centro=Madrid_Centro -Xmx32m -Xms32m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Madrid_Centro -Dappdynamics.agent.nodeName=Madrid_Centro_2 -Dappdynamics.agent.applicationName=TPV -jar TPVClient.jar &
nohup java -Dtpv.centro=Madrid_Centro -Xmx32m -Xms32m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Madrid_Centro -Dappdynamics.agent.nodeName=Madrid_Centro_3 -Dappdynamics.agent.applicationName=TPV -jar TPVClient.jar &

nohup java -Dtpv.centro=Barcelona -Xmx32m -Xms32m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Barcelona -Dappdynamics.agent.nodeName=Barcelona_1 -Dappdynamics.agent.applicationName=TPV -jar TPVClient.jar &
nohup java -Dtpv.centro=Barcelona -Xmx32m -Xms32m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Barcelona -Dappdynamics.agent.nodeName=Barcelona_2 -Dappdynamics.agent.applicationName=TPV -jar TPVClient.jar &
nohup java -Dtpv.centro=Barcelona -Xmx32m -Xms32m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Barcelona -Dappdynamics.agent.nodeName=Barcelona_3 -Dappdynamics.agent.applicationName=TPV -jar TPVClient.jar &

nohup java -Dtpv.centro=Valencia -Xmx32m -Xms32m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Valencia -Dappdynamics.agent.nodeName=TPV_Valencia_1 -Dappdynamics.agent.applicationName=TPV -jar TPVClient.jar &
nohup java -Dtpv.centro=Valencia -Xmx32m -Xms32m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Valencia -Dappdynamics.agent.nodeName=TPV_Valencia_2 -Dappdynamics.agent.applicationName=TPV -jar TPVClient.jar &
nohup java -Dtpv.centro=Valencia -Xmx32m -Xms32m -javaagent:/Users/jan.kirchner/VProjects/controller_3_4215_centos7/TPV_Lab/appserver/javaagent.jar -Dappdynamics.agent.tierName=TPV_Valencia -Dappdynamics.agent.nodeName=TPV_Valencia_3 -Dappdynamics.agent.applicationName=TPV -jar TPVClient.jar &
