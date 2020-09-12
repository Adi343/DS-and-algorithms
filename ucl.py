def main():
    #print("Hello World!")
    teams = ()
    home_goals = {}
    away_goals = {}
    goal_difference = []
    points_table = {}

    T = int(input())
    for i in range(12):
        homeTeam, homeGoal, temp, awayTeam, awayGoal = input().split()
        teams.__add__(homeTeam)
        teams.__add__(awayTeam)
        homeGoal = int(homeGoal)
        awayGoal = int(awayGoal)
        goal1 = home_goals[homeTeam]
        goal2 = away_goals[awayTeam]
        home_goals[homeTeam] = goal1 + homeGoal
        away_goals[awayTeam] = goal2 + awayGoal

        if(homeGoal > awayGoal):
            points_table[homeTeam] += 3
        elif(awayGoal > homeGoal):
            points_table[awayTeam] += 3
        else:
            points_table[homeTeam] += 1
            points_table[awayTeam] += 1

    for team in range(teams):
        print(team)


if __name__ == "__main__":
    main()
