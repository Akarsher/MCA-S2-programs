echo "enter value"
read a
s=1
for ((i=1;i<=$a;i++))
do
s=$((s*i))
done
echo "facotrial is : "$s
