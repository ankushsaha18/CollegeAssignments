def find_numbers():
    for num in range(100, 501):
        if num % 3 == 0 and num % 5 == 0:
            print(num,end=' ')

find_numbers()

'''
105 120 135 150 165 180 195 210 225 240 255 270 285 300 315 330 345 360 375 390 405 420 435 450 465 480 495

'''