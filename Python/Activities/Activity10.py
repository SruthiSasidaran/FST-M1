#Given tuple of numbers
num_tuple = (10,20,30,40,60)
print("The numbers in the tuple are:", num_tuple)

#Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (num % 5 == 0):
        print(num)