echo "simple calculator"
echo "enter 2 numbers:"
read a b
echo "select the operation to perform:"
s=1
while [ $s == 1 ]
do 
echo -e "1.addition\n2.subtraction\n3.multiplication\n4.division"
read n

case $n in
	1)
	  echo "sum is " $((a+b))
	;;
	2)
	  echo "difference is " $((a-b))
	;;
	3)
	  echo "product is " $((a*b))
	;;
	4)
	  echo "division is " $((a/b))
	;;  
	*)
	echo -n "Invalid option"
	;;
esac	
echo "do you wish to continue yes(1)/no(0)"
read s
done
