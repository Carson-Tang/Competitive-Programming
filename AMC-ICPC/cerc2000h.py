t = int(input())
def switch(u): return "you" if u == "I" else "I"
for i in range(1,t+1):
    print("Dialogue #"+str(i)+":")
    order = 0
    CONTRADICTION = 0
    d = {
        "everybody" : [],
        "nobody" : [],
        "I" : [],
        "you" : []
    }
    d2 = {}
    while 1:
        order += 1
        s = input()
        lastchar = s[-1:]
        if lastchar == '.':
            s = s[:-1].split()
            subject = s[0]
            if s[1] not in ["don't", "doesn't"]:
                verb = s[1]
                obj = ""
                for i in range(2,len(s)): obj += s[i] + " "
                obj = obj[:-1]
                if subject not in ["I", "you"]: verb = verb[:-1]
                activity = verb
                if len(obj) > 0: activity += " " + obj
                if subject == "everybody":
                    if activity in d2:
                        for a,b in d2[activity]:
                            if a == "nobody": CONTRADICTION = 1
                    negactivity = "-" + activity
                    if negactivity in d2: CONTRADICTION = 1
                elif subject == "nobody":
                    if activity in d2:
                        for a,b in d2[activity]:
                            if a != "nobody": CONTRADICTION = 1
                else:
                    if subject in d:
                        for a,b in d[subject]:
                            if a == "-" + activity: CONTRADICTION = 1
                    if activity in d2:
                        for a,b in d2[activity]:
                            if a == "nobody": CONTRADICTION = 1
                f = 0
                if subject not in d: d[subject] = []
                for a,b in d[subject]:
                    if a == activity: f = 1
                if f == 0: d[subject].append((activity, order))
                f = 0
                if activity not in d2: d2[activity] = []
                for a,b in d2[activity]:
                    if a == subject: f = 1
                if f == 0: d2[activity].append((subject, order))
            else: 
                verb = "-" + s[2]
                obj = ""
                for i in range(3,len(s)): obj += s[i] + " "
                obj = obj[:-1]
                activity = verb
                if len(obj) > 0: activity += " " + obj
                if activity[1:] in d2:
                    for a,b in d2[activity[1:]]:
                        if a == subject or a == "everybody": CONTRADICTION = 1
                f = 0
                if subject not in d: d[subject] = []
                for a,b in d[subject]:
                    if a == activity: f = 1
                if f == 0: d[subject].append((activity, order))
                f = 0
                if activity not in d2: d2[activity] = []
                for a,b in d2[activity]:
                    if a == subject: f = 1
                if f == 0: d2[activity].append((subject, order))
        elif lastchar == '?':
            print(s)
            if CONTRADICTION == 1:
                print("I am abroad.")
                print()
                continue
            s = s[:-1].split()
            if s[0] in ["do", "does"]:
                subject = s[1]
                verb = s[2]
                obj = ""
                for i in range(3,len(s)): obj += s[i] + " "
                obj = obj[:-1]
                activity = verb
                if len(obj) > 0: activity += " " + obj
                f = 0
                for a,b in d["everybody"]:
                    if a == activity: f = 1
                if f == 1:
                    if subject in ["I", "you"]: subject = switch(subject)
                    else:
                        activity = verb + "s"
                        if len(obj) > 0: activity += " " + obj
                    print("yes, " + subject + " " + activity + ".")
                    print()
                    continue
                for a,b in d["nobody"]:
                    if a == activity: f = 1
                if f == 1:
                    if subject in ["I", "you"]:
                        subject = switch(subject)
                        print("no, "  + subject + " don't " + activity + ".")
                    else:
                        print("no, " + subject + " doesn't " + activity + ".")
                    print()
                    continue            
                if activity in d2:
                    for a,b in d2[activity]:
                        if a == subject: f = 1
                if f == 1: 
                    if subject in ["I", "you"]: subject = switch(subject)
                    else:
                        activity = verb + "s"
                        if len(obj) > 0: activity += " " + obj
                    print("yes, " + subject + " " + activity + ".")
                    print()
                    continue
                activity = "-" + verb
                if len(obj) > 0: activity += " " + obj
                if activity in d2:
                    for a,b in d2[activity]:
                        if a == subject: f = 1
                if f == 1:
                    if subject in ["I", "you"]:
                        subject = switch(subject)
                        print("no, "  + subject + " don't " + activity[1:] + ".")
                    else:
                        print("no, " + subject + " doesn't " + activity[1:] + ".")
                    print()
                    continue
                print("maybe.")
                print()
            elif s[0] == "who":
                verb = s[1]
                verb = verb[:-1]
                obj = ""
                for i in range(2,len(s)): obj += s[i] + " "
                obj = obj[:-1]
                activity = verb
                if len(obj) > 0: activity += " " + obj
                f = 0
                if activity in d2:
                    for a,b in d2[activity]:
                        if a == "nobody": f = 1
                if f == 1:
                    activity = s[1]
                    if len(obj) > 0: activity += " " + obj
                    print("nobody " + activity + ".")
                    print()
                    continue
                if activity in d2:
                    for a,b in d2[activity]:
                        if a == "everybody": f = 1
                if f == 1:
                    activity = s[1]
                    if len(obj) > 0: activity += " " + obj
                    print("everybody " + activity + ".")
                    print()
                    continue
                people = []
                if activity in d2: people = d2[activity]
                if len(people) == 1:
                    subject = people[0][0]
                    if subject in ["I", "you"]:
                        subject = switch(subject)
                        print(subject + " " + activity + ".")
                    else:
                        activity = s[1]
                        if len(obj) > 0: activity += " " + obj
                        print(subject + " " + activity + ".")
                    print()
                    continue
                elif len(people) > 1:
                    people.sort(key = lambda x : x[1])
                    names = ""
                    for i in range(len(people)-2):
                        if i > 0: names += " "
                        addname = people[i][0]
                        if addname in ["I", "you"]: addname = switch(addname)
                        names += addname
                        if i < len(people)-2: names += ","
                    if len(people) > 2: names += " "
                    secondlast = people[-2][0]
                    last = people[-1][0]
                    if secondlast in ["I", "you"]: secondlast = switch(secondlast)
                    if last in ["I", "you"]: last = switch(last)
                    names += secondlast + " and " + last
                    print(names + " " + activity + ".")
                    print()
                    continue
                print("I don't know.")
                print()
            elif s[0] == "what":
                stt = {}
                st = set()
                actions = []
                subject = s[2]
                for a,b in d["everybody"]:
                    if a in stt: stt[a] = min(stt[a],b)
                    else: stt[a] = b
                for a,b in d["nobody"]:
                    aa = "-" + a
                    if aa in stt: stt[aa] = min(stt[aa],b)
                    else: stt[aa] = b
                if subject in d:
                    for a,b in d[subject]:
                        if a in stt: stt[a] = min(stt[a],b)
                        else: stt[a] = b
                for a,b in stt.items(): st.add((a,b))
                actions = sorted(st, key = lambda x : x[1])
                sentence = ""
                for i in range(len(actions)):
                    a = actions[i][0]
                    if i == len(actions)-1 and i > 0: sentence += " and"
                    if a[0] == "-":
                        if subject in ["I", "you"]: sentence += " don't " + a[1:] + ","
                        else: sentence += " doesn't " + a[1:] + ","
                    else:
                        if subject in ["I", "you"]: sentence += " " + a + ","
                        else:
                            activity = ""
                            action = a.split()
                            for i in range(len(action)):
                                activity += action[i]
                                if i == 0: activity += 's'
                                activity += " "
                            activity = activity[:-1]
                            sentence += " " + activity + ","  
                if subject in ["I", "you"]: subject = switch(subject)
                if len(actions) == 0: print("I don't know.")
                else: print(subject + sentence[:-1] + ".")
                print()
        elif lastchar == '!':
            print(s)
            print()
            break
