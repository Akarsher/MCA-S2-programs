# Write a shell script to check whether the given number is palindrome or not.

read -p "enter a number: " a
rev=0;
temp=$a;

while [[ $temp -gt 0 ]] 
do
    digit=$((temp % 10))
    rev=$((rev * 10 + digit))
    temp=$((temp / 10))
done

if [ $rev -eq $a ]
then 
    echo "it is a palindrone."
else
    echo "it is not a palindrome"
fi
