# Dictionary of fruits and their prices (in INR)
fruit_shop = {
    "apple": 120,
    "banana": 40,
    "mango": 150,
    "orange": 80,
    "grapes": 90,
    "pineapple": 60,
    "watermelon": 50,
}

key_to_check = input("What are you looking for? ").lower()
 
if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")
