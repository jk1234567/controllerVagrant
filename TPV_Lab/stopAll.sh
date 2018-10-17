#!/bin/bash

ps -ef| grep TPV | grep java | awk '{print $2}' | xargs kill -9 2> /dev/null

