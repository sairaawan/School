public enum Group{
    Group1(1), Group2(2) ,Group3(3), Group4(4);

    private int id;

    Group(int id){
        this.id = id;
    }

    public int getID(){
        return id;
    }

    }
