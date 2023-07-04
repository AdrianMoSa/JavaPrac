#!/bin/bash
#
#estructura while
SUM=0
i=0
while [ $i -le 100 ]; do
    let SUM=SUM+i
    let i++
done
echo "La suma total es :" $SUM

echo "***********************"

#estructura for
SUM=0
for VAR in $( seq 1 100 ); do
    SUM=$(expr $SUM + $VAR)
done
echo "La suma total es :" $SUM
