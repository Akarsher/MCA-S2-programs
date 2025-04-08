
echo "enter 2 numbers:"
read a b
c=1
while [ $c == 1 ]
do 
echo -e "1.sum of digits .\n2.largest number \n3.sum of squares of digits\n4.exit.\nselect the operation to perform:"
read n

case $n in
	1)
	  num=$a
	  s= 0
	  echo "sum of digits of $a = "
	  while [ $num -gt 0 ]
	  do
	  r=$(( $num % 10 ))
	  s=$(( s + r ))
	  num=$(( $num / 10 ))
	  done
	  echo $s
	;;
	2)
	  if [[ $a -gt $b ]]
	  then 
	  echo "$a is the largest."
	  else
	  echo "$b is the largest."
	  fi
	;;
	3)
	num1=$a
	s= 0
	echo "sum of square of digits = "
	while [ $num1 -gt 0 ]
	  do
	  r=$(( $num1 % 10 ))
	  s=$(( s + r * r  ))
	  num1=$(( $num1 / 10 ))
	  done
	  echo $s
	;;
	4)
	  echo "exiting program ..."
	  break
	;;
	*)
	echo -n "Invalid option"
	break
	;;
esac	
echo "do you wish to continue yes(1)/no(0)"
read c
done
