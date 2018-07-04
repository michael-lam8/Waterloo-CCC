while True:
	parking = input('Number of parking spaces: ')
	yesterday = input('Occupied parking spaces yesterday: ')
	today = input('Occupied parking spaces today: ')
	occupied = 0
	parkingInt = int(parking)

	yesterdayChar = list(yesterday)
	todayChar = list(today)

	for x in range(0, parkingInt):
		if yesterdayChar[x] is 'C' and todayChar[x] is 'C':
			occupied += 1
		x += 1

	print('Number of parking spaces occupied yesterday and today: ', occupied)
