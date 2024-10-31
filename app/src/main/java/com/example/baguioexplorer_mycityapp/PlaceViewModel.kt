package com.example.baguioexplorer_mycityapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlaceViewModel : ViewModel() {
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> get() = _places

    fun loadPlaces(category: String) {
        _places.value = when (category) {
            "Coffee Shops" -> listOf(
                Place("Cafe by the Ruins", "A historic cafe known for its ambiance. Known for its rustic ambiance and local art, this cafe serves traditional Filipino dishes, fresh bread, and locally sourced coffee. It’s a must-visit for both tourists and locals.\n\n" +
                        "Address: Ruins, Upper Session Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Breakfast: Tapsilog, Longsilog\n" +
                        "Drinks: Brewed coffee, Fresh fruit juices\n" +
                        "Desserts: Strawberry shortcake, Local pastries\n\n" +
                        "Price Range: ₱150 - ₱500\n\n" +
                        "Specials: Known for their locally sourced ingredients and unique blends of coffee. They often have seasonal specials featuring local delicacies.", R.drawable.cafe_by_the_ruins),
                Place("Choco-late de Batirol", "Famous for its hot chocolate and local delicacies. This outdoor cafe in Camp John Hay is famous for its traditional hot chocolate (batirol) and rustic setup surrounded by nature. It’s a popular spot for a cozy, nostalgic drink.\n\n" +
                        "Address: Camp John Hay, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Drinks: Hot chocolate, Coffee\n" +
                        "Snacks: Kakanin, S'mores\n\n" +
                        "Price Range: ₱100 - ₱300\n\n" +
                        "Specials: Offers traditional Filipino snacks and outdoor seating in a serene environment.", R.drawable.choco_late_de_batirol),
                Place("Arca's Yard", "A beautiful view cafe with great food. This cafe offers a homey ambiance with an art gallery and museum showcasing Igorot culture. Try their camote pie and enjoy the beautiful view of the mountains.\n\n" +
                        "Address: Ambuklao Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Specialties: Camote pie, Beef tapa\n" +
                        "Drinks: Coffee, Herbal tea\n\n" +
                        "Price Range: ₱150 - ₱400\n\n" +
                        "Specials: Offers art exhibits featuring local artists and has a great view of the mountains.", R.drawable.arcas_yard),
                Place("Tsokolateria Artisanal Café", "Located in Igorot Stairs, this cafe specializes in chocolate-based drinks and dishes, from hot cocoa to chocolate fondue. The cozy, outdoor setting makes it an ideal spot to relax.\n\n" +
                        "Address: Igorot Stairs, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Drinks: Hot chocolate (batirol), Coffee\n" +
                        "Snacks: Chocolate fondue, Kakanin (rice cakes)\n\n" +
                        "Price Range: ₱100 - ₱350\n\n" +
                        "Specials: Specializes in chocolate-based treats and has an outdoor setting that enhances the dining experience.", R.drawable.tsokolatera),
                Place("Café Yagam","Known for its traditional Cordilleran cuisine, Café Yagam offers a peaceful atmosphere in a cozy house setting. Their coffee is locally sourced, and their food includes unique dishes like pinikpikan.\n\n" +
                        "Address: 22 Upper Magsaysay Ave, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Dishes: Pinikpikan (traditional dish), Cordilleran specialties\n" +
                        "Drinks: Brewed coffee\n\n" +
                        "Price Range: ₱100 - ₱300\n\n" +
                        "Specials: Focuses on local Cordilleran cuisine and culture.", R.drawable.cafe_yagam),
                Place("The Coffee Library","This cafe serves a variety of coffee drinks, local and international dishes, and is known for its casual ambiance, making it a great spot to relax with a book or work on a laptop.\n\n" +
                        "Address: 33 Upper Session Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Coffee: Espresso, Americano\n" +
                        "Food: Sandwiches, Pastries\n\n" +
                        "Price Range: ₱100 - ₱400\n\n" +
                        "Specials: Features a cozy reading area with a selection of books.",R.drawable.coffeelib),
                Place("Beans Talk","Located along Session Road, this cafe offers a great view of the city, freshly brewed coffee, and delicious pastries. It’s popular for its relaxed atmosphere and friendly service.\n\n" +
                        "Address: Session Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Drinks: Coffee, Smoothies\n" +
                        "Snacks: Pastries, Sandwiches\n\n" +
                        "Price Range: ₱80 - ₱300\n\n" +
                        "Specials: Offers a beautiful view of the city from its balcony seating.",R.drawable.beanstalk),
                Place("Hatch Coffee","Known for its minimalistic and modern vibe, Hatch Coffee is perfect for those seeking good coffee and pastries in a relaxed, creative setting. It’s popular among students and young professionals.\n\n" +
                        "Address: 75 Upper Session Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Coffee: Single-origin brews, Specialty lattes\n" +
                        "Food: Pastries, Light meals\n\n" +
                        "Price Range: ₱100 - ₱250\n\n" +
                        "Specials: Known for its minimalistic design and artisan coffee.",R.drawable.hatchcoffee),
                Place("Il-lengan Cafe","With a serene, outdoor setup in Itogon, this hidden gem offers an escape from the busy city. Its name means \"a place to rest,\" and the cafe lives up to its name with its quiet atmosphere and mountain views.\n\n" +
                        "Address: Itogon, Baguio City (short drive from the city center)\n\n" +
                        "Menu Highlights:\n" +
                        "Dishes: Local dishes, Snacks\n" +
                        "Drinks: Coffee, Herbal tea\n\n" +
                        "Price Range: ₱100 - ₱200\n\n" +
                        "Specials: Features a relaxing outdoor ambiance surrounded by nature.",R.drawable.illengan),
                Place("Sage Café","A stylish cafe offering comfort food, pastas, and desserts. Located near downtown Baguio, it’s known for its cozy vibe and Insta-worthy interiors.\n\n" +
                        "Address: 69 Session Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Dishes: Pasta, Salads\n" +
                        "Drinks: Coffee, Smoothies\n\n" +
                        "Price Range: ₱100 - ₱400\n\n" +
                        "Specials: Known for its modern ambiance and Instagram-worthy presentations.",R.drawable.sagecafe),
            )
            "Restaurants" -> listOf(
                Place("Good Taste", "Known for its affordable yet generous servings, this casual eatery is a favorite among locals and tourists.\n\n" +
                        "Address: 69, Lower General Luna Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Specialties: Fried Rice, Sweet and Sour Pork, Lechon Kawali\n" +
                        "Noodles: Pancit Canton, Beef Mami\n" +
                        "Desserts: Halo-Halo, Leche Flan\n\n" +
                        "Price Range: ₱100 - ₱300\n\n" +
                        "Specials: Value meals and daily promotions.", R.drawable.good_taste),
                Place("The Hill Station", "The Hill Station offers a cozy ambiance and a menu that highlights both local and international flavors, making it a popular choice for fine dining. The restaurant's vintage decor and warm atmosphere provide a perfect backdrop for a memorable dining experience.\n\n" +
                        "Address: 14 Upper Session Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Starters: Cheese Platter, Bruschetta\n" +
                        "Main Courses: Lamb Chops, Baked Salmon, Pasta\n" +
                        "Desserts: Dark Chocolate Cake, Cheesecake\n\n" +
                        "Price Range: ₱300 - ₱1,200\n\n" +
                        "Specials: Wine pairing dinners and seasonal gourmet offerings.", R.drawable.hillstation),
                Place("The Forest House", "Nestled in the cool pines, The Forest House is known for its rustic charm and a menu that celebrates fresh, local ingredients. Diners can enjoy a mix of Filipino and Western dishes while taking in the serene mountain views.\n\n" +
                        "Address: 36-38 Outlook Ridge, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Appetizers: Wild Mushroom Soup, Caesar Salad\n" +
                        "Main Courses: Grilled Pork Tenderloin, Seafood Risotto\n" +
                        "Desserts: Tiramisu, Apple Pie\n\n" +
                        "Price Range: ₱250 - ₱800\n\n" +
                        "Specials: Weekend buffets and holiday-themed menus.", R.drawable.forethouse),
                Place("The Red Lion", "The Red Lion is a cozy pub that serves delicious comfort food and a wide range of drinks. Its warm, inviting atmosphere makes it a popular hangout for both locals and tourists looking to unwind.\n\n" +
                        "Address: 2, Upper Session Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Appetizers: Nachos, Buffalo Wings\n" +
                        "Main Courses: Fish and Chips, Burgers\n" +
                        "Desserts: Cheesecake, Chocolate Lava Cake\n\n" +
                        "Price Range: ₱200 - ₱600\n\n" +
                        "Specials: Happy hour promotions and live music events.", R.drawable.redlion),
                Place("Raff's Fried Chicken House", "Famous for its roasted chicken, Raff;s Fried Chicken House serves a variety of Filipino dishes in a casual setting. The restaurant's specialty is its flavorful chicken, marinated and cooked to perfection.\n" +
                        "\nAddress: Military Cut-Off Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Specialties: Roasted Chicken, Chicken Inasal\n" +
                        "Side Dishes: Rice, Vegetables, Grilled Fish\n" +
                        "Desserts: Leche Flan, Halo-Halo\n\n" +
                        "Price Range: ₱150 - ₱400\n\n" +
                        "Specials: Family meal packages and discounts on bulk orders.", R.drawable.raffs),
                Place("Alfresco Restaurant", "Alfresco offers a relaxing outdoor dining experience surrounded by nature, making it a great spot for families and gatherings. The menu features a mix of local and international cuisine.\n\n" +
                        "Address: 72, Upper Session Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Appetizers: Calamares, Cheese Sticks\n" +
                        "Main Courses: Pork Sisig, Grilled Squid\n" +
                        "Desserts: Brownies, Fruit Salad\n\n" +
                        "Price Range: ₱200 - ₱500\n\n" +
                        "Specials: Weekend brunch and family combo meals.", R.drawable.alfresco),
                Place("Ganza Restaurant", "Ganza Restaurant combines a cozy ambiance with a menu featuring a mix of Filipino and Asian cuisine. The establishment is popular for its hearty dishes and family-friendly atmosphere.\n\n" +
                        "Address: 25, 27 Upper General Luna Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Rice Meals: Beef Steak, Chicken Adobo\n" +
                        "Noodles: Chow Mein, Seafood Noodles\n" +
                        "Desserts: Bibingka, Cassava Cake\n\n" +
                        "Price Range: ₱150 - ₱450\n\n" +
                        "Specials: Lunch specials and group dining discounts.", R.drawable.ganza),
                Place("Sizzling Plate", "Sizzling Plate is known for its sizzling dishes served on hot plates, providing a unique dining experience. The restaurant offers a variety of options, from sizzling steaks to seafood, all prepared to perfection.\n\n" +
                        "Address: 23, Upper Session Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Sizzling Dishes: Sizzling Beef, Pork Sisig\n" +
                        "Rice Meals: Garlic Rice, Fried Rice\n" +
                        "Desserts: Ice Cream, Pudding\n\n" +
                        "Price Range: ₱200 - ₱500\n\n" +
                        "Specials: Sizzling platter specials and birthday promos.", R.drawable.sizzling),
                Place("Mangan Tayo", "Mangan Tayo offers a taste of traditional Filipino dining with its home-cooked meals and warm service. The restaurant is a favorite for those looking for a comforting and authentic dining experience.\n\n" +
                        "Address: 4, Lower Gen. Luna Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Specialties: Pinoy-style BBQ, Sinigang na Baboy\n" +
                        "Rice Meals: Longsilog, Tocilog\n" +
                        "Desserts: Cassava Cake, Puto\n\n" +
                        "Price Range: ₱150 - ₱400\n\n" +
                        "Specials: Daily set meals and discount for senior citizens.", R.drawable.mangantayo),
                Place("Tito’s Grill", "Tito’s Grill is a local favorite known for its grilled specialties and laid-back atmosphere. The restaurant offers a range of Filipino dishes, perfect for those looking to enjoy traditional flavors.\n\n" +
                        "Address: 56, Upper Session Road, Baguio City\n\n" +
                        "Menu Highlights:\n" +
                        "Grilled Dishes: Grilled Liempo, BBQ Chicken\n" +
                        "Rice Meals: Beef Steak, Pork Sinigang\n" +
                        "Desserts: Puto, Turon\n\n" +
                        "Price Range: ₱150 - ₱400\n\n" +
                        "Specials: Weekend grill specials and family meal packages.", R.drawable.titos),
            )
            "Kid-Friendly Places" -> listOf(
                Place("Burnham Park", "A vast park where kids can enjoy paddle boating on the lake, ride bicycles, or have a family picnic. It's a lively spot that offers a variety of child-friendly activities in a safe environment.\n\n" +
                        "Address: Jose Abad Santos Drive, Baguio, Benguet\n\n" +
                        "Activities: Paddle boating, biking, playground, and picnicking.", R.drawable.burnham_park),
                Place("Botanical Garden", " This scenic garden has beautiful pathways, statues, and a mini-zoo, making it a peaceful spot for families to explore together. Kids can learn about plants, enjoy nature, and see traditional Igorot huts.\n\n" +
                        "Address: Leonard Wood Rd, Baguio, Benguet\n\n" +
                        "Activities: Walking trails, plant observation, learning about local culture, and photo opportunities.", R.drawable.botanical_garden),
                Place("Mines View Park", "This park offers panoramic mountain views and allows kids to experience traditional attire and ride horses. They can learn about the local mining history and enjoy fresh mountain air.\n\n" +
                        "Address: Mines View Observation Deck, Mines View, Baguio, Benguet\n\n" +
                        "Activities: Horseback riding, trying on traditional attire, scenic viewing.", R.drawable.mines_view_park),
                Place("Camp John Hay", " A former American military base, Camp John Hay has sprawling grounds, a butterfly sanctuary, and adventure playgrounds. It's perfect for kids who enjoy both outdoor play and learning about history.\n\n" +
                        "Address: Camp John Hay, Loakan Rd, Baguio, Benguet\n\n" +
                        "Activities: Playground, butterfly sanctuary, and mini golf.", R.drawable.jhonhay),
                Place("Tree Top Adventure Baguio", " This adventure park offers safe and child-friendly zip lines and forest trails for a thrilling experience. Kids can explore nature while enjoying a little adrenaline.\n\n" +
                        "Address: Camp John Hay, Loakan Rd, Baguio, Benguet\n\n" +
                        "Activities: Zip lining, canopy walks, and eco-trails.", R.drawable.treeetop),
                Place("Baguio Museum", "A family-friendly museum featuring exhibits on the culture and history of the Cordillera region, perfect for young history buffs. Kids can explore artifacts, traditional clothing, and learn about local heritage.\n\n" +
                        "Address: DOT-PTA Complex, Gov. Pack Rd, Baguio, Benguet\n\n" +
                        "Activities: Cultural exhibits, interactive displays, and historical exploration.", R.drawable.baguiomuseum),
                Place("Mirador Heritage and Eco Park", "With a bamboo grove, stone gardens, and a panoramic viewpoint, this eco-park offers a quiet escape where children can explore and enjoy nature. It’s a great place for family hikes and nature walks.\n\n" +
                        "Address: Mirador Hill, Baguio, Benguet\n\n" +
                        "Activities: Hiking, bamboo grove exploration, and stone labyrinth.", R.drawable.mirador),
                Place("Tam-awan Village", "This cultural village recreates traditional Cordillera houses and offers art workshops, letting children learn about indigenous culture in a hands-on way. Kids can join art sessions and meet local artists.\n\n" +
                        "Address: 366-C Pinsao Proper, Baguio, Benguet\n\n" +
                        "Activities: Art workshops, exploring traditional houses, and cultural immersion.", R.drawable.tamawan),
                Place("Igorot Stone Kingdom", "This attraction resembles a stone fortress with pathways leading to different terraces, inspired by local Igorot culture and folklore. Kids can learn about local myths while exploring the stonework.\n\n" +
                        "Address: Longlong Rd, Pinsao Proper, Baguio, Benguet\n\n" +
                        "Activities: Exploring pathways, climbing terraces, and learning about folklore.", R.drawable.stoneking),
                Place("Maryknoll Ecological Sanctuary", "A quiet sanctuary where children can enjoy nature and learn about ecological conservation through thematic trails. It’s a refreshing spot for families who appreciate both art and nature.\n\n" +
                        "Address: Campo Sioco Rd, Baguio, Benguet\n\n" +
                        "Activities: Guided nature trails, eco-workshops, and peaceful family hikes.", R.drawable.maryknoll),
            )
            "Parks" -> listOf(
                Place("Wright Park", "Famous for its pool of pines and horseback riding activities, Wright Park also offers a lovely view of the Baguio Mansion. It’s perfect for family outings and taking scenic photos.\n\n" +
                        "Address: Gibraltar Road, Baguio, Benguet\n\n" +
                        "Special Features: Known for horseback riding and the picturesque “Pool of Pines,” with stalls nearby for souvenir shopping.", R.drawable.wright_park),
                Place("Mines View Park", "A viewing deck at this park provides stunning panoramas of the Cordillera mountains and the Itogon mines. It also features various souvenir shops and traditional costumes for photo opportunities.\n\n" +
                        "Address: Mines View Observation Deck, Baguio, Benguet\n\n" +
                        "Special Features: The viewing deck, traditional costume photo ops, and souvenir stalls make it a tourist hotspot.", R.drawable.mines_view_park),
                Place("Burnham Park", "This iconic park is known for its spacious lawns, picturesque lagoon with rowboats, and vibrant flower gardens. It’s ideal for leisure activities like cycling, boating, and picnicking.\n\n" +
                        "Address: Jose Abad Santos Drive, Baguio, Benguet\n\n" +
                        "Special Features: Offers boat rides on the lagoon, a rose garden, and a skating rink; it's a favorite for tourists and locals alike.", R.drawable.burnham_park_boating),
                Place("Panagbenga Park", "Dedicated to the annual Panagbenga (Flower Festival), this park is adorned with vibrant blooms and hosts themed sculptures. It’s a colorful space for taking photos and enjoying nature.\n\n" +
                        "Address: Camp John Hay, Loakan Rd, Baguio, Benguet\n\n" +
                        "Special Features: Highlights include flower displays, festival-inspired sculptures, and benches for relaxation.", R.drawable.panagbenga),
                Place("Igorot Garden", "A small, peaceful park in the city center, featuring statues honoring the native Igorot people. It’s a cultural site for rest and relaxation amid the hustle and bustle of Baguio.\n\n" +
                        "Address: Shanum St, Baguio, Benguet\n\n" +
                        "Special Features: Highlights include cultural sculptures and benches, making it a great stop for photos and relaxation.", R.drawable.igorotgarden),
                Place("Heritage Hill and Nature Park Garden", "This historic site offers a mix of nature, old architecture, and panoramic city views. Known for its mysterious past, the abandoned Diplomat Hotel adds intrigue to the park.\n\n" +
                        "Address: Dominican Hill, Baguio, Benguet\n\n" +
                        "Special Features: Known for its haunting stories, historical ruins, and scenic overlook of Baguio City.", R.drawable.heritage),
                Place("Pine Trees of the World Park", "This serene park showcases a variety of pine tree species, creating a forested oasis in the city. It’s a quiet, shaded area great for a stroll and nature photography.\n\n" +
                        "Address: South Drive, Baguio, Benguet\n\n" +
                        "Special Features: Known for its collection of different pine tree species from around the world, providing an international forestry experience.", R.drawable.pinetrees),
                Place("Sunshine Park", "This small, beautifully landscaped park is located near Burnham Park and is ideal for a relaxing visit. It's known for its colorful flower beds and koi pond.\n\n" +
                        "Address: Harrison Road, Baguio, Benguet\n\n" +
                        "Special Features: Highlights include a tranquil koi pond, floral displays, and shaded areas perfect for picnicking.", R.drawable.sunshine),
                Place("Happy Hallow Community Eco-Park", "This eco-park is located in a community on the outskirts of Baguio, offering trails, a river, and picnic spots surrounded by nature. It’s an off-the-beaten-path park perfect for a quiet escape.\n\n" +
                        "Happy Hallow, Baguio, Benguet\n\n" +
                        "Special Features: Known for its local flora, tranquil atmosphere, and a sustainable tourism focus with community involvement.", R.drawable.happyhollow),
                Place("The Rose Garden", "Part of Burnham Park, this beautiful garden is filled with vibrant rose bushes and floral displays, perfect for leisurely walks and photo opportunities. It’s a peaceful spot within the bustling Burnham Park area.\n\n" +
                        "Address: Burnham Park, Jose Abad Santos Dr, Baguio, Benguet\n\n" +
                        "Special Features: Known for its rose varieties and manicured flower beds, it adds a romantic touch to the larger Burnham Park.", R.drawable.rosegarden),
            )
            "Shopping Centers" -> listOf(
                Place("SM City Baguio", "Located in the heart of Baguio, SM City is the largest mall in the city, offering a mix of local and international brands alongside stunning mountain views. The open-air mall also provides diverse dining options and a cinema.\n\n" +
                        "Address: Luneta Hill, Upper Session Road, Baguio City\n\n" +
                        "What to Buy: Clothing, accessories, electronics, groceries, souvenirs, and various Baguio-made crafts.", R.drawable.sm_city_baguio),
                Place("Baguio Public Market", "Baguio’s Public Market is a vibrant, sprawling area known for its variety of local goods, fresh produce, and traditional crafts. It’s a perfect place for a truly local shopping experience.\n\n" +
                        "Address: Magsaysay Ave, Baguio City\n\n" +
                        "What to Buy: Vegetables, fruits, pasalubong items (souvenirs), woven products, silver jewelry, coffee beans, and Cordilleran crafts.", R.drawable.baguio_public_market),
                Place("Baguio Night Market", "The Baguio Night Market on Harrison Road is one of the most popular night shopping events in the city, offering great bargains on clothes, shoes, and souvenirs. Open from late evening until midnight, it’s perfect for night owls.\n\n" +
                        "Address: Harrison Road, Baguio City\n\n" +
                        "What to Buy: Thrifted clothes, jackets, bags, shoes, accessories, and street food.", R.drawable.baguio_night_market),
                Place("Baguio Center Mall", "A bustling local mall frequented by residents, Baguio Center Mall offers an affordable shopping experience with local retailers and eateries. It’s known for its variety of budget-friendly finds and central location.\n\n" +
                        "Address: Magsaysay Ave, Baguio City\n\n" +
                        "What to Buy: Affordable clothing, footwear, accessories, household items, and Filipino street food.", R.drawable.centermal),
                Place("Porta Vaga Mall", "Porta Vaga Mall is a smaller yet popular shopping center with a more relaxed vibe and offers a mix of retail, dining, and services. It’s a favorite for finding unique specialty stores and food options.\n\n" +
                        "Address: Session Road, Baguio City\n\n" +
                        "What to Buy: Artisanal crafts, local artwork, clothing, and specialty foods from Baguio.", R.drawable.porta),
                Place("Maharlika Livelihood Complex", "Known as a hub for local handicrafts, the Maharlika Complex offers a range of affordable items made by local artisans. It’s ideal for tourists seeking authentic Baguio products with a cultural touch.\n\n" +
                        "Address: Magsaysay Ave, Baguio City\n\n" +
                        "What to Buy: Woven bags, traditional clothing, wood carvings, silver jewelry, and local produce like vegetables and fruits.", R.drawable.maharlika),
                Place("Sky World Commercial Center", "Sky World Commercial Center is a low-key shopping spot with affordable clothing and thrift shops, popular among budget-conscious shoppers. It has a vintage appeal, perfect for bargain hunters.\n\n" +
                        "Address: Session Road, Baguio City\n\n" +
                        "What to Buy: Pre-loved clothing, shoes, and budget-friendly accessories.", R.drawable.skyworld),
                Place("Hilltop Agora Market", "Hilltop Agora Market is a bustling open market known for its fresh produce and vibrant atmosphere. It’s a popular stop for both locals and tourists who enjoy discovering local flavors.\n\n" +
                        "Address: Hilltop St., Baguio City\n\n" +
                        "What to Buy: Fresh vegetables, strawberries, meat, and other locally grown produce, as well as handicrafts and Baguio souvenirs.", R.drawable.hilltop),
                Place("Abanao Square", "Abanao Square is a multi-level mall offering a mix of local and international retail brands, along with dining options and essential services. It’s a practical shopping destination located near the city center.\n\n" +
                        "Address: Abanao Street, Baguio City\n\n" +
                        "What to Buy: Fashion items, electronics, sporting goods, accessories, and basic household items.", R.drawable.abanao),
                Place("Cordillera World Shop", "Cordillera World is a specialty shop that focuses on promoting local arts and crafts from the Cordillera region. The shop provides a platform for local artisans and supports sustainable crafts.\n\n" +
                        "Address: Upper Session Road, Baguio City\n\n" +
                        "What to Buy: Traditional Cordilleran crafts, woven textiles, indigenous jewelry, and décor.\n", R.drawable.cordilleraworld),
            )
            else -> emptyList()
        }
    }
}