import math

g = 9.8
vi = 0

h = float(input("Enter the height(in meters): "))

vf = math.sqrt(vi**2 + 2 * g * h)

print(f"The final speed of the object is: {vf} m/s")


'''
    Enter the height(in meters): 20
    The final speed of the object is: 19.79898987322333 m/s
'''