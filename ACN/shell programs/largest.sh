echo "*****largest_number*****";

read -p "enter 2 numbers: " a b;
if [[ $a -gt $b ]] then
    echo "$a is largest."
elif [[ $b -gt $a ]] then
    echo "$b is largest."
else
    echo "Both are same."
fi
