while True:
  decide = 0
  ignore = None
  aStr = input()
  bStr = input()
  cStr = input()
  dStr = input()

  aInt = int(aStr)
  bInt = int(bStr)
  cInt = int(cStr)
  dInt = int(dStr)

  if aInt is 8 or aInt is 9:
    decide += 1
  if bInt is cInt:
    decide += 1
  if dInt is 8 or dInt is 9:
    decide += 1


  if decide is not 3:
    print('ignore')
  elif decide is 3:
    print('answer')