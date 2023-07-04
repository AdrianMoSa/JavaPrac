#!/bin/bash
#
echo "*****Doble o nada*****"
echo "**********************"

echo "Introduce una cantidad"
read APUESTA

MONEDA=$(($RANDOM%2))

if [ $MONEDA = 0 ]; then
    let APUESTA=APUESTA*2
    echo "Ha salido cara. Has ganado"
    echo $APUESTA
elif [ $MONEDA = 1 ]; then
    let APUESTA=0
    echo "Ha salido cruz. Has perdido. Otra vez será"
fi
