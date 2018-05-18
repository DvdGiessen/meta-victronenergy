#!/bin/bash
exec 2>&1
echo "*** Starting signalk ***"

PLUGINCONF=/data/conf/signalk/plugin-config-data
DEFAULTCONF=/usr/lib/node_modules/signalk-server/defaults

# make all config dir
mkdir -p /data/conf/signalk/plugin-config-data

# install plugin default config(s)
if [ ! -f "$PLUGINCONF/venus.json" ]; then
        cp "$DEFAULTCONF/venus.json" "$PLUGINCONF"
fi

exec /usr/lib/node_modules/signalk-server/bin/signalk-server -c /data/conf/signalk

