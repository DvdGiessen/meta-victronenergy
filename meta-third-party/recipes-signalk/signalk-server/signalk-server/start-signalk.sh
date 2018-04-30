#!/bin/bash
exec 2>&1
echo "*** Starting signalk ***"
mkdir -p /data/conf/signalk
exec /usr/lib/node_modules/signalk-server/bin/signalk-server -c /data/conf/signalk

