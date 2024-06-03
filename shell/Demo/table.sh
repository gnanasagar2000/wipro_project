count=1
echo "Enter the number"
read num
while [ $count -lt 11 ]
    do
    value=`expr $num \* $count`
    echo "$num * $count = $value"
    count=`expr $count + 1`
donebash tabb