echo "enter a number : "
read a
flag=0
for ((i=2;i<=a;i++))
  do 
  if ((a % i==0))
  then 
  	flag=1
  	break
  fi
  done 
if ((flag == 1))
then  
	echo "$a is prime number"
else
	echo "$a is not prime number"	 
fi
