cities = input()
distanceArray = cities.split(' ')
distanceArrayInt = [int(i) for i in distanceArray]

distance1 = distanceArrayInt[0] + distanceArrayInt[1]
distance2 = distance1 + distanceArrayInt[2]
distance3 = distance2 + distanceArrayInt[3]

city1 = [0, distanceArrayInt[0], distance1, distance2, distance3]
city2 = [distanceArrayInt[0], 0, distanceArrayInt[1], distanceArrayInt[1] + distanceArrayInt[2], distanceArrayInt[1] + distanceArrayInt[2] + distanceArrayInt[3]]
print(city1)
print(city2)
