#!/bin/sh

. $(dirname $0)/functions.sh

root=$(get_rootdev $(get_rootfs))
if [ -z "$root" ]; then
    echo "Unable to determine rootfs. Exit."
    exit 1
fi

echo "resizing $root"
resize2fs $root
