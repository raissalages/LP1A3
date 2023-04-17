public record Address(String state, String city, String street, int number, String complement) {
    public String getAddress(){
        if(complement != null) {
            return state + " " + city + " " + street + " " + number + " " + complement;
        }
        return state + " " + city + " " + street + " " + number;
    }
}
