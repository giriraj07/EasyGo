package com.example.easygo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    public static HashMap<String, ArrayList<String>> map=new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDetails=findViewById(R.id.btnDetails);
        Button btnDisp=findViewById(R.id.btnDisp);
        Button btnInfo=findViewById(R.id.btnInfo);

         CreateMap();
        btnDetails.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Intent i = new Intent(getBaseContext(), DisplayStops.class);
                                              startActivity(i);
                                          }
                                      });
        btnDisp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),DisplayRoute.class);
                startActivity(i);
            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),Activity4.class);
                startActivity(i);
            }
        });
    }
    public void CreateMap()
    {
        String[] arr={"Stop Names","Harsh Vihar","Gagan Cinema X-ing", "Bank Colony", "Nand Nagi Depot", "Ashok Nagar"
                , "L.R. X-Ing", "Gokalpur", "YAMUNA VIHAR C-1", "Bhajan Pura", "Khajoori", "Nanak Sar", "Wazirabad Bridge",
                "Balak Ram Hospital", "Timar Pur", "Mall Road", "INS Hostel", "Patel Chest", "Maurice Nagar",
                "P.S Kamala Nagar", "Nagiya Park", "Gulabi Bagh", "Subhadra Colony", "Zakhira", "S B Mill",
                "Campa Cola", "ESI Dispensary", "Moti Nagar", "Kirti Nagar", "Ramesh Nagar", "Bali Nagar",
                "Raja Garden", "Rajouri Garden", "Tagore Garden", "Tatapura", "Mukherjee Park"};
         ArrayList<String> l1=new ArrayList<String>(Arrays.asList(arr));
         map.put("234", l1);

         String[] arr1={"Stop Names", "Anand Vihar Terminal", "Mahrajpur Check Post", "Gazipur Depot", "Hasanpur Village",
                 "Hasanpur Depot", "Ashirwad Apartment", "Chandar Vihar", "Balco Apartment", "Vijay Laxmi Apartment",
                 "Parivar Apartment", "Sarswati Kunj", "Press Apartment", "Government Model School", "Mother Dairy",
                 "School Block Shakarpur", "Rainy Well", "Delhi Secretariat", "ITO (AGCR)", "Mandi House",
                 "Firoz Shah Road", "Windsor Place", "Krishi Bhawan", "Red Cross Road", "Aakashwani Bhawan",
                 "A I R / NDPO", "Kendriya Terminal", "RML Hospital", "Talkatora Garden", "Bhart Sadhu Samaj",
                 "RLY Colony", "Taj Hotel", "Dhaula Kuan", "Golf Club", "R R Line", "Mall Road", "Shastri Bazar",
                 "P S Sadar Bazar", "Kirbi Place", "Janak Setu", "D-Block Janak Puri", "Sagar Pur Vashisht Park",
                 "Desu Colony", "C-3 Janak Puri", "Janak Puri C-2B", "C-1 Janak Puri", "Jivan Park", "Tilak Pul",
                 "A-1 Janakpuri"};
        ArrayList<String> l2=new ArrayList<String>(Arrays.asList(arr1));
        map.put("740", l2);
        String[] arr2={"Stop Names", "Uttam Nagar Terminal", "Vikas Puri Xing", "Sonia Cinema", "Budella Village",
                "Oxford School", "Gurudwara Vikas Puri", "H Block Vikas Puri", "Vikas Puri J G Block",
                "Major Bhupendra Singh Nagar", "Keshav Pur Depot", "Meera Bagh", "Sunder Vihar",
                "Paschim Vihar Power House", "Peera Garhi Depot", "Peera Garhi Chowk", "Vidhya Vihar",
                "Mangolpuri B-Block", "West Enclave", "Mangol Pur School", "Rohini Depot III", "Pushpanjali Enclave",
                "Kali Mandir", "Deepali Chowk", "Saraswati Vihar C- Block", "Madhuvan Chowk", "Madhuvan Chowk",
                "Power House P.Vihar", "North Pittam Pura Petrol Pump", "Haidar Pur Water Works", "Badli X-Ing",
                "GTK Bye Pass", "GTK Depot", "Jahangir Puri Xing", "Sarai Pipal Thala", "Adarsh nagar",
                "New Sabzi Mandi", "Azad Pur", "Model Town IIIrd", "Model Town IInd", "GTB Nagar", "INS Hostel",
                "Vishwa Vidyalaya Metro Station", "Mall Road", "Khyber Pass", "Old Secrettariate", "IP College",
                "Civil Line Metro Station", "Ludlow Castle"};
        ArrayList<String> l3=new ArrayList<String>(Arrays.asList(arr2));
        map.put("883", l3);
        String[] arr3={"Stop Names", "Subhash Nagar", "Rajouri Garden", "Raja Garden", "Bali Nagar", "Bassi Dara Pur",
                "Kirti Nagar", "Moti Nagar Market", "Moti Nagar", "Shadi Pur Depot", "West Patel Nagar",
                "South Patel Nagar", "East Patel Nagar", "Rajender Nagar Post Office", "Shankar Road",
                "New Rajender Nagar", "Ridge Road", "Talkatora Stadium", "Ram Manohar Lohiya Hospital",
                "Talkatora Road", "Kendriya Terminal", "NDPO", "Gurudwara Bangla Shahib", "Patel Chowk",
                "Aakashwani Bhawan", "Krishi Bhawan", "National Archives", "National Museum", "Patiala House",
                "Jaipur House", "Golf Club", "PS Nizamuddin", "Hajrat Nizamuddin", "Bhogal", "Ashram",
                "Nehru Nagar", "Shri Nivas Puri", "Lajpat Nagar", "Lajpat Nagar"};
        ArrayList<String> l4=new ArrayList<String>(Arrays.asList(arr3));
        map.put("410", l4);
        String[] arr4={"Stop Names", "Lajpat Nagar", "Lajpat Nagar", "Gupta Market", "Andrews Gunj", "South Extension",
                "South Extension", "AIIMS", "Safderjung Hospital", "Raj Nagar", "Nauroji Nagar", "Hyatt Hotel",
                "R.K.Puram More", "RK Puram Sector-12", "Moti Bagh", "Nanak Pura", "Satya Niketan", "ARSD College",
                "Dhaula Kuan", "R.R.Line", "Gairison Eng.", "Barar Square", "Naraina Village", "Naraina Vihar",
                "Indira Market", "M.P.Chowk", "Rajouri Garden", "Rajdhani College", "Raja Garden", "ESI Hospital",
                "Punjabi Bagh Club", "Punjabi Bagh (T)", "Punjabi Bagh Ext", "Mother Dairy Paschim Puri",
                "Road No.29/30 Xing", "A-3 Paschim Vihar", "Jwala Hari MKT", "Paschim Vihar Water Tank",
                "Peeragarhi Depot", "Peera Garhi", "Udhyog Nagar", "Inder Enclave", "Jwala Puri",
                "Nangloi JJ Colony No. 3", "Sultanpuri X-Ing"};
        ArrayList<String> l5=new ArrayList<String>(Arrays.asList(arr4));
        map.put("567", l5);
        String[] arr5={"Stop Names", "Vasant Kunj Sec-2", "Kishan Garh", "Vasant Kunj B-3", "B 8 Vasant Kunj", "B-8/9 Goyanka School Vasant Kunj",
            "Bhatnagar International School", "Vasant Kunj Police Station C-8", "Shopping Center Mall", "Baba Gang Nath marg Xing", "V V Depot",
            "Poorvi Marg", "R K Puram Sector-7 Malai Mandir", "RK Puram Sector-8", "R K Puram Sec-7 Xing", "Moti Bagh I", "Rail Museum",
            "USSR Embassy", "Chanakya Puri Police Station", "Teen Murti", "South Avanue", "Sena Bhawan", "G Block", "Udyog Bhawan",
            "Rail Bhawan Metro Station", "Red Cross Road", "Aakashwani Bhawan", "Sansad Marg Police Station", "Palika Kendra/Park Hotel",
            "Shivaji Park", "Vivekanand Marg", "Police Station Kamla Market"};
        ArrayList<String> l6=new ArrayList<>(Arrays.asList(arr5));
        map.put("604",l6);

        l6=new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "Tilak Nagar Terminal", "Tilak Nagar Mod", "Nangli Zalbi", "District Centre",
                "Dholli Piyau", "Vikas Puri X-Ing", "Uttam Nagar Terminal", "Uttam Nagar Shiv Mandir", "Om Vihar", "Matyala Villlage", "Nawada",
                "Rama Park", "Kakroula Mod", "Kakrola Bridge", "Nangli Dairy", "Arjun Park", "Kant Darshan Darbar", "Nangli Sakrawati Village",
                "Sain Baba Temple", "Power House", "Chara Mandi", "Najafgarh", "Najafgarh", "Chawla Stand", "Roshan Pura", "BDO Office",
                "Durga Vihar", "Dinpur Village", "Goyela X-Ing", "Shyam Vihar", "Shyam Vihar", "Goyela Village", "Tajpur X-Ing"}));
         map.put("873",l6);
        String[] arr6={"Stop Names", "Fateh Puri", "Shiv Hanuman Mandir", "SP Mukhrajee Marg", "Maharani Avanti Bai Lodhi Chowk",
            "Maharani Avanti Bai Lodhi Chowk", "New Cort", "Railway Colony Moti Bagh", "Ice Factory", "Roshnara Road", "Delhi Flour Mill",
            "Roshnara Road", "Roshnara Bagh", "Clock Tower", "Clock Tower", "Clock Tower", "Birla Mill", "Shakti Nagar", "Kamla Market",
            "Rup Nagar", "Gur Mandi", "Maha Rana Pratap Bagh", "R P Bagh", "Gurudwara Nanak Pyau", "SBI Colony", "Harmilap Mission Ashram",
            "Telephone Exchange", "Gujranwala Town", "Bara Bagh", "Azad Pur", "Azad Pur Terminal", "Azad Pur Sabji Mandi",
            "New Sabji Mandi Azad Pur", "Adresh Nagar", "Sarai Pipal Thala", "Jahangir Puri GT Road", "GTK Depot", "GTK By Pass",
            "Sanjay Gandhi Transport Nagar", "Libas Pur", "Swaroop Nagar", "Gurudwara", "Nangli Poonam", "Jain Mandir", "Budhpur",
            "BDO Office", "Ali Pur", "PDW", "PT Office Ali Pur", "Palla X-Ing", "Palla X-Ing", "Mahatma Gandhi Complex",
            "Bakhtawar Pur School", "Triveni", "Bakhtawar Pur Village", "Bakhtawar Pur Garhi", "Akbar Pur Majra X-Ing", "Taj Pur More"};
         l6=new ArrayList<>(Arrays.asList(arr6));
        map.put("125",l6);

         l6=new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "Shahdra Terminal", "Shyam Lal College", "Kanti Nagar", "Jhankhand", "East Azad Nagar", "Swarn Cinema",
                "East Krishna Nagar", "Hans Apartment", "Arjun Nagar", "Radhey Puri", "Jagat Puri A Block", "Jagat Puri F Block", "KARKARDOOMA XING",
                "New Rajdhani Enclave", "Swasthaya Vihar", "Nirman Vihar", "Shakar Pur More", "Shakar Pur", "Laxmi Nagar", "Rainy Well", "Delhi Secretariat",
                "ITO (AGCR)", "ITO", "Mandi House", "Mandi House", "Kasturba Gandhi X-ing", "Firoz Shah Road", "Kirshi Bhawan", "Akshwani Bhawan",
                "Gurudwara Bangla Shahib", "NDPO", "Kendriya Terminal", "Kendriya Terminal"}));
        map.put("320",l6);
        map.put("33",new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "Noida Sector 37", "Atta Chowk", "Noida Sector-38A", "Atta Peer", "Noida Sector-3", "Noida Sector 4", "Noida Sector 9", "Noida Sec-12", "Sector-12 Noida", "Noida Sec-12 & 22", "Noida Sector 12", "Noida Sector 8", "Jhund Pura", "Mayur Vihar Phase-3 X-Ing", "Dallu Pura", "Kondli", "Kalyan Puri", "Gazi Pur Dairy Farm", "National Highway X-ing", "Gazi Pur Village", "TELCO Gazipur", "Gazipur Depot", "Anand Vihar Terminal", "Ram Prastha X-Ing", "Ram Prastha Temple", "Surya Nagar", "Shahdra Border", "J & K Pocket Dilshad Garden", "Old Seemapuri", "New Seema Puri", "Seemapuri X-Ing", "DLF", "Kustha Ashram", "Tahirpur", "Sunder Nagari", "Nand Nagari", "Nand Nagari Terminal", "GTB Crossing", "Nand Nagari C Block", "Natthu Colony Chowk", "Durga Puri", "Jyoti Nagar", "Babar Pur", "Kabir Nagar", "Yamuna Vihar C-12", "C-4 Yamuna Vihar", "C Block Yamuna Vihar", "Yamuna Vihar C-1", "Yamuna Vihar B-Block"})));
        map.put("213",new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "Harsh Vihar", "Gagan Cinema", "Nand Nagari F-Block", "Nand Nagri Ternimal", "GTB Hospital Xing", "Jagat Puri", "Durga Puri", "Chhaju Pur", "Babarpur Ext.", "Zafrabad School", "Zafrabad", "Kishan Kunj Enclave", "Seelam Pur", "Shastri Park", "Sham Giri Mandir", "ISBT FLYOVER", "GGSU Kashmere gate", "GPO", "Red Fort", "Jamuna Road", "Darya Gunj", "Delhi Gate", "LNJP Hospital", "Zakir Husain College", "J L Nehru Marg", "Vivekanad Marg", "Super Bazar", "Regal Cinema", "P/S Sansad marg", "Patel Chowk", "Gurudwara Bangla Shahib", "NDPO", "Kendriya Terminal, Pt.Pant Marg"})));
        map.put("534",new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "Anand Vihar", "Mahrajpur Check Post", "Gazipur Depot", "Tata Motors", "Hasanpur Village", "Hasanpur Depot", "Ashirwad Apartment", "Chandar Vihar", "Prince Apartment", "Neethi Apartment", "Balco Apartment", "Vijaya Laxmi Apartment", "Parivar Apartment", "Ras Vihar", "Saraswati Kunj", "Press Apartment", "Government Model School", "Dharma Apartment", "Mother Dairy X-Ing", "Samas Pur Jagir Village", "Akhardham Temple", "Nizamuddin Road Bridge", "Sarai Kale Khan", "Gurudwara Bala Sahib", "Maharani Bagh", "Ashram Chowk", "New Friends Colony", "Bharat Nagar", "Holy Family Hospital", "Sukh Dev Vihar", "NSIC", "Nehru Place", "O S Communication", "Masjid Moth", "Sheik sarai Phase 2", "Vocational College", "Khirki Village", "Hauz Rani", "Press Enclave", "Saket A Block", "PNB Geetanjali", "PTS", "DDA Flat Lado Sarai", "T.B. Hospital", "Qutab Minar"})));
        map.put("440",new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "Dr Ambedkar Nagar Depot", "Khanpur Village", "Vayu Sena Bad", "Sri Satya Narayan Mandir", "Batra Hospital", "Sangam Vihar", "Majeedia Hospital", "Hamdard Nagar", "Guru Ravi Das Temple", "Tara Appartment", "DDA Flats Kalkaji", "DDA Flats Kalkaji", "Govind Puri", "Kalkaji", "Desh Bandhu College", "Kalkaji B-Block", "Nehru Place", "Paras", "Sant Nagar", "Kailash Colony", "LSR College", "Central School", "Andrews Ganj", "Defence Colony", "J L Nehru Stadium", "Central School Lodhi Road", "Lodhi Colony", "Lodhi Road Corner", "Max Mulller Marg", "Jammu & Kashmir House", "Shahajahan Road", "Baroda House", "Bhartiya Vidhya Bhawan", "Max Muller Bhawan", "Sindhiya House", "Shivaji Park", "Vivekanand Marg", "Police Station Kamla Market"})));
        map.put("317",new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "Shivaji Stadium Terminal", "Super Bazar", "Govt Press", "DDU Marg", "Govt Sr.Sec. School", "Bal Bhawan", "ITO", "Delhi Secretarait", "Rainy Well", "Ramesh Park", "Bank Enclave", "Sahstri Nagar Pushta", "Laji enclave", "Chacha Nehru Hospital", "Gurudwara Jheel Colony", "Jheel Dispensary", "Jheel Terminal", "Lala Quarter", "Krishna Nagar", "Azad Nagar Mod", "Jharkhandi", "Kanti Nagar", "Shyam Lal College"})));
        map.put("172",new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "Holambi Kalan JJ Colony", "Holambi Kalan", "Holambi Khurad", "Holambi College", "Union Bank of India Holambi", "Naya Bans", "Khera Khurad", "Khera Kalan", "Khera Garhi School", "Nangli Puna", "Jain Mandir", "Budh Pur", "Jain Mandir", "Nangli Poonam", "Gurudwara GT Road", "Swaroop Nagar", "Libas Pur", "Sanjay Gandhi Transport Nagar", "G T K By Pass", "GTK Depot", "Jahangir Puri G T Road", "Sarai Pipal Thala", "Adarsh Nagar", "New Anaz Mandi", "Azadpur", "Bada Bagh", "Gujranwala Town", "Telephone Exchang", "State Bank Colony", "State Bank Colony", "Gurudwara Nanak Pyau", "R P Bagh", "Gur Mandi", "Shakti Nagar", "Kamla Nagar", "Clock Tower", "Clock Tower", "Rsohnara Bagh", "Roshanara Road", "Delhi Flour Mill", "Ice Factory", "Ice Factory", "New Court", "Mori Gate", "Nityanand Marg", "ISBT Kashemre Gate", "Kashmere Gate ISBT", "ISBT", "ISBT Kashmiri Gate", "ISBT Kashmiri Gate", "GPO", "Lal Quila", "Lal Quila", "Jama Masjid", "Dariya Ganj", "Dariya Ganj", "Delhi Gate", "Delhi Gate", "LNJP Hospital", "LNJP Hospital", "Zakir Husain College", "J L Nehru Marg", "Police Station Kamla Market"})));
        map.put("301",new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "BMD Chowk", "Red Fort", "Jama Masjid", "Darya Ganj", "Delhi Gate", "Raj Ghat", "ITO Ring Road", "Delhi Secretarait", "Rainy Well", "Laxmi Nagar X-Ing", "School Block Shakar Pur", "Ganesh Nagar Staff Quarter", "Mother Dairy", "P.S Trilok Puri", "13-Block Trilok Puri", "Chand Cinema", "Super Bazar", "Kalyan Puri", "Kondli X-Ing", "New Kundli A1", "Gharoli Village"})));
        map.put("56",new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "New Delhi Railway Station Gate No.2", "Shivaji Park", "Super Bazar", "Scindia House", "Max Muller Bhawan", "Bhartiya Vidhya Bhawan", "Baroda House", "National Stadium", "Shahajahan Road", "Ravindra Nagar", "Sujan Singh Park", "Bharti Nagar", "Dayal Singh College", "Lodhi Estate X-Ing", "Lodhi Colony 18-Block", "Lodhi Colony Corner", "Lodhi Colony", "Jor Bagh", "S J Airport", "INA Colony", "Laxmi Bai Nagar", "Pilanji Village", "Sarojani Nagar Market", "I Block", "M Block", "S N Depot", "Africa Avenue", "Sabdarjung Enclave", "Bhikaji Kama Place", "Mohommad Pur", "R K Puram Sec-2", "R K Puram Sec-3", "R K Puram Sec-4", "R K Puram Sec-1", "R K Puram Sec-5", "Poorvi Marg", "Modern School"})));
        map.put("898",new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "Tilak Nagar", "Nangli Zalib", "District Centre", "Janak Puri West Metro Station", "Dholi Pioa", "Vikas Puri X-Ing", "Uttam Nagar Terminal", "Om Vihar", "Nawada", "Mohan Garden", "Rama Park", "Dwarka X-Ing", "Kakorla Bridge", "Kakorla Palam X-Ing", "Nangli Dairy", "Arjun Park(State Bank)", "Kant Darshan Darwar", "Sai Baba Mandir", "Power House", "Najafgarh", "Chhawla Stand Nazafgarh", "Roshan Pura Village", "BDO Office", "Durga Vihar", "Deenpur", "Jhatikara X-Ing", "Rewala Khanpur", "Poultry Farm", "Pindwala Kalan X-Ing", "Daulat Pur X-Ing", "Asalatpur Khwad-XIng"})));
        map.put("810",new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "Kendria Terminal", "North Avenew", "RML Hospital", "Talkatora Stadium", "Ridge Road", "Rajender Nagar New Post Office", "Shankar Road", "East Patel Nager", "South Patel Nagar", "West Patel Nagar", "Shadipur Metro Station", "Shadipur Depot", "Moti Nagar Industrial Area", "Moti Nagar", "Kirti Nagar", "Ramesh Nagar", "Bali Nagar", "Raja Garden", "Rajouri Garden", "Rajouri Garden", "Tagore Garden", "Titar Pur", "Mukherjee Park", "Meenakshi Garden", "Sant Pura", "Tilak Nagar", "Tilak Nagar X-ing", "Nangli Zalib", "District Centre", "Dholi Piao", "Vikas Puri X-Ing A-1 Janakpuri"})));
        map.put("534",new ArrayList<>(Arrays.asList(new String[]{"Stop Names", "Anand Vihar ISBT", "Hasan Pur Depot", "Balco Apartment", "Press Apartment", "Manglam Hospital", "Mother Dairy X-Ing", "Pusta Xing", "East Road Bridge", "Sarai Kale Khan", "Maharani Bagh", "Holly Family Xing", "Modi Mills"})));
    }
}
