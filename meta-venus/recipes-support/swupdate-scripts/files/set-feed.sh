#!/bin/sh

if [ $# -eq 0 ]; then
	echo "Usage: $0 release|candidate|testing|develop"
	exit 1
fi

echo "Switching feed to $1"

case $1 in
	release )
		dbus-send --system --type=method_call --dest=com.victronenergy.settings /Settings/System/ReleaseType com.victronenergy.BusItem.SetValue variant:int32:0
		;;
	candidate )
		dbus-send --system --type=method_call --dest=com.victronenergy.settings /Settings/System/ReleaseType com.victronenergy.BusItem.SetValue variant:int32:1
		;;
	testing )
		dbus-send --system --type=method_call --dest=com.victronenergy.settings /Settings/System/ReleaseType com.victronenergy.BusItem.SetValue variant:int32:2
		;;
	develop )
		dbus-send --system --type=method_call --dest=com.victronenergy.settings /Settings/System/ReleaseType com.victronenergy.BusItem.SetValue variant:int32:3
		;;
	*)
		echo "Not a valid parameter"
		;;
esac

# switch package feed as well
ln -sf /usr/share/venus-feed-configs/opkg-$1.conf /etc/opkg/venus.conf