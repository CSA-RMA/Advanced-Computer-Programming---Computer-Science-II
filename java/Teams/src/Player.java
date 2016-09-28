class Player {
    String name;
    int goals;
    Player(String pekka, int i) {
        this.name=pekka;
        this.goals=i;
    }
    Player(String name) {
        this.name=name;
        this.goals=0;
    }
    public String toString() {
        return name+", goals: "+goals;
    }
    public String getName() {
        return name;
    }
    public int getGoals() {
        return goals;
    }
}