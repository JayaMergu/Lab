/**Define a class Address representing an address with attributes such as street, city, state, and zip code. Provide constructors to initialize these attributes.
*/
class Address{ // Address class for Address
    String city,state,street; // string attributes
    int zipCode;    //int attribute
    Address(String city,String state,String street,int zipCode){// Parameterized onstructor Initialization
        this.city=city; // assigning the attributes
        this.state=state;
        this.street=street;
        this.zipCode=zipCode;
    }
    void printData(){// to print the data method
        System.out.println("The Address is City: "+city+" state is: "+state+" Street is: "+street+" zipCode is: "+zipCode);
    }
 
}
class UseAddress{ // main method class for Address
    public static void main(String args[]){
        Address a1=new Address("Solapur","Maharastra","MIDC",413003); // giving agruments to object creation
        a1.printData();// callilng method using object
    }
}
/**
 * Output:
 * D:\java>javac UseAddress.java

D:\java>java UseAddress
The Address is City: Solapur state is: Maharastra Street is: MIDC zipCode is: 413003
 */