#Write a shell script to swap 2 numbers with & without using a temporary variable.

echo "Enter 2 numbers a&b:"
read a b
c=$a
a=$b
b=$c
echo "after swapping with temporary variable "
echo "a =" $a "b =" $b

a=$((a + b))
b=$((a - b))
a=$((a - b))
echo "after swapping without temporary variable "
echo "a =" $a "b =" $b


