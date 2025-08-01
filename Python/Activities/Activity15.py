try:
    # Define the variable before using it
    undefined_variable = "This variable is now defined"
    print(undefined_variable)
except NameError as e:
    print(f"Caught a NameError: {e}")

print("Program continues running smoothly.")
