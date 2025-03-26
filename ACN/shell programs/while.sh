echo "Enter an integer:"
read num

fact=1
n=$num

while [[ $n -gt 1 ]]
do
    fact=$((fact * n))
    n=$((n - 1))
done
echo "Factorial using while loop is "$fact


