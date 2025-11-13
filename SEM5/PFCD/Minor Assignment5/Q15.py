import random

def roll_dice():
    return random.randint(1, 6) + random.randint(1, 6)
    
wins = {}
losses = {}

n = 1000000

for _ in range(n):
    roll_num = 1
    first_roll = roll_dice()

    if first_roll in (7, 11):
        wins[roll_num] = wins.get(roll_num, 0) + 1
        continue
    elif first_roll in (2, 3, 12):
        losses[roll_num] = losses.get(roll_num, 0) + 1
        continue
    point = first_roll
    while True:
        roll_num += 1
        roll = roll_dice()
        if roll == point:
            wins[roll_num] = wins.get(roll_num, 0) + 1
            break
        elif roll == 7:
            losses[roll_num] = losses.get(roll_num, 0) + 1
            break

total_wins = sum(wins.values())
total_losses = sum(losses.values())

percent_wins = (total_wins / n) * 100
percent_losses = (total_losses / n) * 100

print(f"Percentage of wins: {percent_wins:.2f}%")
print(f"Percentage of losses: {percent_losses:.2f}%\n")

all_rolls = set(wins.keys()).union(losses.keys())
print("Rolls | % Resolved on this roll | Cumulative % of games resolved")
print("-" * 66)
cumulative = 0
for roll in sorted(all_rolls):
    resolved_this_roll = wins.get(roll, 0) + losses.get(roll, 0)
    percent_this_roll = (resolved_this_roll / n) * 100
    cumulative += percent_this_roll
    print(f"{roll:<5}   {percent_this_roll:>21.2f}%   {cumulative:>25.2f}%")


'''
Percentage of wins: 49.26%
Percentage of losses: 50.74%

Rolls | % Resolved on this roll | Cumulative % of games resolved
------------------------------------------------------------------
1                       33.32%                       33.32%
2                       18.78%                       52.10%
3                       13.54%                       65.64%
4                        9.65%                       75.29%
5                        6.97%                       82.25%
6                        4.97%                       87.22%
7                        3.58%                       90.81%
8                        2.56%                       93.37%
9                        1.84%                       95.21%
10                       1.33%                       96.54%
11                       0.94%                       97.47%
12                       0.70%                       98.17%
13                       0.50%                       98.67%
14                       0.36%                       99.04%
15                       0.26%                       99.30%
16                       0.19%                       99.49%
17                       0.15%                       99.63%
18                       0.10%                       99.73%
19                       0.07%                       99.81%
20                       0.05%                       99.86%
21                       0.04%                       99.90%
22                       0.03%                       99.92%
23                       0.02%                       99.94%
24                       0.02%                       99.96%
25                       0.01%                       99.97%
26                       0.01%                       99.98%
27                       0.01%                       99.98%
28                       0.00%                       99.99%
29                       0.00%                       99.99%
30                       0.00%                       99.99%
31                       0.00%                       99.99%
32                       0.00%                      100.00%
33                       0.00%                      100.00%
34                       0.00%                      100.00%
35                       0.00%                      100.00%
36                       0.00%                      100.00%
37                       0.00%                      100.00%
38                       0.00%                      100.00%
39                       0.00%                      100.00%
40                       0.00%                      100.00%
41                       0.00%                      100.00%
42                       0.00%                      100.00%
43                       0.00%                      100.00%

'''