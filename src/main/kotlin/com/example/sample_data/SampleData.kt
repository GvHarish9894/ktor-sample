package com.example.sample_data

import com.example.entitiy.City
import com.example.entitiy.Volunteer
import com.example.entitiy.Community
import com.example.entitiy.Location
import com.example.entitiy.Utility
import com.example.entitiy.Article
import com.example.entitiy.HelpLine

val volunteerList = listOf(
    Volunteer(1, "Ravi Kumar", "ravi@volunteer.com", "9876543210", City(1, "Chennai")),
    Volunteer(2, "Pooja Patel", "pooja@volunteer.com", "9876543211", City(2, "Mumbai")),
    Volunteer(3, "Amit Sharma", "amit@volunteer.com", "9876543212", City(3, "Delhi")),
    Volunteer(4, "Rita Singh", "rita@volunteer.com", "9876543213", City(4, "Kolkata")),
    Volunteer(5, "Sunil Rao", "sunil@volunteer.com", "9876543214", City(5, "Hyderabad")),
    Volunteer(6, "Neha Reddy", "neha@volunteer.com", "9876543215", City(6, "Bangalore")),
    Volunteer(7, "Rajiv Patel", "rajiv@volunteer.com", "9876543216", City(7, "Ahmedabad")),
    Volunteer(8, "Kiran Deshmukh", "kiran@volunteer.com", "9876543217", City(8, "Pune")),
    Volunteer(9, "Suresh Yadav", "suresh@volunteer.com", "9876543218", City(9, "Jaipur")),
    Volunteer(10, "Ragini Mehta", "ragini@volunteer.com", "9876543219", City(10, "Surat")),
)
val communityList = listOf(
    Community(1, "Coastal Rescue", City(1, "Chennai"), Location(13.0827, 80.2707), Volunteer(1, "Ravi Kumar", "ravi@volunteer.com", "9876543210", City(1, "Chennai")), Utility(1, "Medical Aid")),
    Community(2, "Mountain Rescue", City(2, "Mumbai"), Location(19.0760, 72.8777), Volunteer(2, "Pooja Patel", "pooja@volunteer.com", "9876543211", City(2, "Mumbai")), Utility(2, "Shelter Assistance")),
    Community(3, "Flood Relief Squad", City(3, "Delhi"), Location(28.7041, 77.1025), Volunteer(3, "Amit Sharma", "amit@volunteer.com", "9876543212", City(3, "Delhi")), Utility(3, "Food Supply")),
    Community(4, "Disaster Aid Team", City(4, "Kolkata"), Location(22.5726, 88.3639), Volunteer(4, "Rita Singh", "rita@volunteer.com", "9876543213", City(4, "Kolkata")), Utility(4, "Rescue Operations")),
    Community(5, "Emergency Support Group", City(5, "Hyderabad"), Location(17.3850, 78.4867), Volunteer(5, "Sunil Rao", "sunil@volunteer.com", "9876543214", City(5, "Hyderabad")), Utility(5, "Transport Assistance")),
    Community(6, "Fire Rescue Unit", City(6, "Bangalore"), Location(12.9716, 77.5946), Volunteer(6, "Neha Reddy", "neha@volunteer.com", "9876543215", City(6, "Bangalore")), Utility(6, "Emergency Fire Response")),
    Community(7, "Cyclone Watch", City(7, "Ahmedabad"), Location(23.0225, 72.5714), Volunteer(7, "Rajiv Patel", "rajiv@volunteer.com", "9876543216", City(7, "Ahmedabad")), Utility(7, "Cyclone Alert Assistance")),
    Community(8, "Earthquake Response Team", City(8, "Pune"), Location(18.5204, 73.8567), Volunteer(8, "Kiran Deshmukh", "kiran@volunteer.com", "9876543217", City(8, "Pune")), Utility(8, "Earthquake Relief")),
    Community(9, "Shelter Relief Team", City(9, "Jaipur"), Location(26.9124, 75.7873), Volunteer(9, "Suresh Yadav", "suresh@volunteer.com", "9876543218", City(9, "Jaipur")), Utility(9, "Temporary Shelter Assistance")),
    Community(10, "Flood Watch Group", City(10, "Surat"), Location(21.1702, 72.8311), Volunteer(10, "Ragini Mehta", "ragini@volunteer.com", "9876543219", City(10, "Surat")), Utility(10, "Flood Evacuation")),
)
val locationList = listOf(
    Location(13.0827, 80.2707), // Chennai
    Location(19.0760, 72.8777), // Mumbai
    Location(28.7041, 77.1025), // Delhi
    Location(22.5726, 88.3639), // Kolkata
    Location(17.3850, 78.4867), // Hyderabad
    Location(12.9716, 77.5946), // Bangalore
    Location(23.0225, 72.5714), // Ahmedabad
    Location(18.5204, 73.8567), // Pune
    Location(26.9124, 75.7873), // Jaipur
    Location(21.1702, 72.8311), // Surat
)
val utilityList = listOf(
    Utility(1, "Medical Aid"),
    Utility(2, "Shelter Assistance"),
    Utility(3, "Food Supply"),
    Utility(4, "Transport Assistance"),
    Utility(5, "Rescue Operations"),
    Utility(6, "Cyclone Alert Assistance"),
    Utility(7, "Earthquake Relief"),
    Utility(8, "Temporary Shelter Assistance"),
    Utility(9, "Flood Evacuation"),
    Utility(10, "Emergency Fire Response"),
)

val cityList = listOf(
    City(1, "Chennai"),
    City(2, "Mumbai"),
    City(3, "Delhi"),
    City(4, "Kolkata"),
    City(5, "Hyderabad"),
    City(6, "Bangalore"),
    City(7, "Ahmedabad"),
    City(8, "Pune"),
    City(9, "Jaipur"),
    City(10, "Surat"),
    City(11, "Lucknow"),
    City(12, "Kanpur"),
    City(13, "Nagpur"),
    City(14, "Visakhapatnam"),
    City(15, "Bhopal"),
    City(16, "Patna"),
    City(17, "Agra"),
    City(18, "Varanasi"),
    City(19, "Ludhiana"),
    City(20, "Vadodara")
)
val articleList = listOf(
    Article("Flood Alert in Southern Region", "Heavy rains forecasted in the southern region", "https://disasterhelper.com/southern-flood-alert"),
    Article("Earthquake Hits Coastal City", "A 6.2 magnitude earthquake struck the coastal city early this morning.", "https://disasterhelper.com/earthquake-coastal"),
    Article("Evacuation Ordered Due to Cyclone", "Cyclone warning issued, residents in the coastal region must evacuate.", "https://disasterhelper.com/cyclone-evacuation"),
    Article("Rescue Teams Deployed to Flooded Areas", "Emergency rescue teams are on their way to help stranded citizens.", "https://disasterhelper.com/rescue-teams"),
    Article("Relief Camps Setup in Rural Villages", "New relief camps have been setup to assist those affected by the floods.", "https://disasterhelper.com/relief-camps"),
    Article("Food and Water Scarcity in Northern Region", "Floods have disrupted supply chains, causing shortages of essential goods.", "https://disasterhelper.com/food-water-scarcity"),
    Article("Tsunami Alert Lifted for East Coast", "Authorities have lifted the tsunami alert after assessing the situation.", "https://disasterhelper.com/tsunami-alert"),
    Article("Volunteers Needed for Rescue Operations", "The local government is calling for volunteers to assist with rescue operations.", "https://disasterhelper.com/volunteer-rescue"),
    Article("Power Outage in Urban Centers", "Storms have caused power outages across multiple urban centers.", "https://disasterhelper.com/power-outage"),
    Article("Medical Aid Available for Injured Victims", "Medical teams are now available to treat those injured in the disaster.", "https://disasterhelper.com/medical-aid"),
    Article("Bridge Collapses Due to Flooding", "A key bridge in the region has collapsed, disrupting transport routes.", "https://disasterhelper.com/bridge-collapse"),
    Article("Helplines Activated for Emergency Services", "Helplines are now active for emergency relief and assistance.", "https://disasterhelper.com/helpline-activation"),
    Article("Livestock Rescue Teams Mobilized", "Special teams have been deployed to rescue livestock trapped in floodwaters.", "https://disasterhelper.com/livestock-rescue"),
    Article("Government Announces Financial Aid", "Relief funds will be available to those impacted by recent natural disasters.", "https://disasterhelper.com/financial-aid"),
    Article("Temporary Shelters Open for Evacuees", "Temporary shelters have been opened for evacuees from affected areas.", "https://disasterhelper.com/temporary-shelters"),
    Article("Floodwaters Begin to Recede", "After days of heavy rains, floodwaters are now beginning to recede.", "https://disasterhelper.com/floodwaters-recede"),
    Article("Emergency Response Plan Activated", "The government has activated its emergency response plan for natural disasters.", "https://disasterhelper.com/emergency-response"),
    Article("Volunteers Provide Clean Drinking Water", "A volunteer network is providing clean water to flood-affected areas.", "https://disasterhelper.com/clean-water-volunteers"),
    Article("Public Health Advisory Issued", "Public health officials are advising citizens to take precautions due to contaminated water.", "https://disasterhelper.com/health-advisory"),
    Article("Search and Rescue Operations Ongoing", "Search and rescue efforts are still ongoing in the affected areas.", "https://disasterhelper.com/search-rescue")
)
val helpLineList = listOf(
    HelpLine("Flood Help", "1800-123-456", "floodhelp@disasterhelper.com"),
    HelpLine("Cyclone Help", "1800-654-321", "cyclonehelp@disasterhelper.com"),
    HelpLine("Earthquake Relief", "1800-789-123", "earthquake@disasterhelper.com"),
    HelpLine("Shelter Assistance", "1800-555-777", "shelterhelp@disasterhelper.com"),
    HelpLine("Medical Aid", "1800-222-333", "medicalaid@disasterhelper.com"),
    HelpLine("Rescue Operations", "1800-333-666", "rescueops@disasterhelper.com"),
    HelpLine("Evacuation Support", "1800-444-888", "evacuation@disasterhelper.com"),
    HelpLine("Fire Rescue", "1800-999-111", "firerescue@disasterhelper.com"),
    HelpLine("Transport Assistance", "1800-222-444", "transport@disasterhelper.com"),
    HelpLine("Public Health Advisory", "1800-888-222", "health@disasterhelper.com"),
)




