studentIDs=[201,202,203,204,205,206,207]
Scores=[85,92,78,64,88,91,73]

merit = []

for stid,score in zip(studentIDs,Scores):
    if(score >=75):
        merit.append(stid)

print(merit)

def avg(scores):
    n = len(scores)
    s = 0
    for i in scores:
        s += i
    return s/n

print(f"{avg(Scores):.2f}")

def lowest(scores,studentIDs):
    lowest =(scores[0],studentIDs[0])

    for stid,score in zip(studentIDs,Scores):
        if score < lowest[0]:
            lowest = (score,stid)
    return lowest[1]

print(lowest(Scores,studentIDs))