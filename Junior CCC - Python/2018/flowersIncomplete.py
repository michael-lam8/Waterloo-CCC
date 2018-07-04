while True:
  numberOfPlants = input()
  numberOfPlantsInt = int(numberOfPlants)
  
  for x in range(numberOfPlantsInt):
    plants = input()
    data = plants.split(' ')
    dataArray = [int(plants) for plants in data]
    print(dataArray)