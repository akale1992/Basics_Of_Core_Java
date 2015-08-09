class Converter{
static double kmToMiles( double km){
double miles = 0.62 * km;
return miles;
}
public static void main(String []as){
double miles = kmToMiles(15);
system.out.println(miles);
}
}