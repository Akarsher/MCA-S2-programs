echo "enter a string value:"
read a
l=${#a}
echo "length of sting:" $l
echo "enter another string value:"
read b
c="${a} ${b}"
echo "concatination :" $c
echo "enter the string to find"
read r
echo ${a/$r/$b}
