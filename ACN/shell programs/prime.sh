read -p "enter a number :" num 
prime=1
if [ $num -le 1 ]
then
    prime=0
else
    for((i=2;i*i<=num;i++))
    do 
    if (( $num % $i == 0 ))
    then
        prime=0
        break
    fi
    done
fi 
if(($prime == 1))
then 
echo "it is a prime number."
else
echo "it is not a prime number."
fi
