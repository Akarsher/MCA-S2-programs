read -p "enter a numer:" num
for((i=0;$i<$num;i++))
do 
sum=$((i + sum));
done
echo "sum of $num numbers = $sum"
