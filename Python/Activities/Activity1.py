
# Take username and age
name = input("Enter your name: ")
age = int(input("Enter your age: "))

# Calculate the year they turn 100 years old
year_turn_100 = 2025 + (100 - age)

# Print the message
print(name + "will turn 100 years old in year {}" .format(year_turn_100))
print(name + "will turn 100 years old in year " +str(year_turn_100))