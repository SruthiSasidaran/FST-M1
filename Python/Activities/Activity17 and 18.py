import pandas as pd
#activity17

#Create data set
data = {
    "Username": ["user1", "user2", "user3", "user4"],
    "Password": ["pass1", "pass2", "pass3", "pass4"],
}
#Convert data to DataFrame
df = pd.DataFrame(data)

#Write the DataFrame to a CSV file
df.to_csv("./Activities/Activity17.csv",index=False)

#activity18
#Read the data from CSV file 
input_data = pd.read_csv("./Activities/Activity17.csv")

#Print the values only in the username column
print(input_data["Username"])

#Print the username and password of the second row
print(input_data.iloc[1][["Username", "Password"]])

#To add one more username and password without giving in data by concatinating dataframes:
new_row = pd.DataFrame({
    "Username": ["new_user"],
    "Password": ["new_password"]
})
input_data = pd.concat([input_data, new_row]).reset_index(drop=True)
print(input_data)

#Sort the username column data in ascending order and print the data
print("======Sorted usernames======")
print(input_data.sort_values(by="Username")["Username"].reset_index(drop=True))

##Sort the password column data in descending order and print the data
print("======Sorted passwords======")
print(input_data.sort_values(by="Password", ascending=False)["Password"].reset_index(drop=True))