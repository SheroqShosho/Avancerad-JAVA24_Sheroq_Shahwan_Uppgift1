# Avancerad-JAVA24_Sheroq_Shahwan_Uppgift1

# Virtuell Biluthyrning 

Projektet handlar om att ha ett program för att hantera biluthyrning. Programmet gör det möjligt attt visa tillgängliga fordon, hyra ett fordon, returnera fordon samt beräkna hyreskostnader baserat på antal dagar. 

## Funktionalitet

- **Visa tillgängliga fordon**: Se en lista över alla tillgängliga fordon.
- **Hyra fordon**: Hyra ett fordon och beräkna hyreskostnaden.
- **Returnera fordon**: Återlämna ett hyrt fordon.
- **Fordonstyper**:
  - Car
  - SUV
  - Truck
 
 ## Projektstruktur 

 Projektet använder sig av följande komonenter:

 - **Abstrakta klasser och gränssnitt**:
   - `Vehicle`: En abstrakt basklass för olika typer av fordon.
   - `Rentable`: Ett gränssnitt som beskriver uthyrningsfunktionalitet.
  
  - **Klassimplementeringar**:
    - `Car`, `SUV`, och `Truck`: Specialiseringar av `Vehicle` med egna attribt och metoder.
   
  - **Huvudklass**:
    - `Convertible`: Innehåller programmets användargränssnitt och logik.

 ## Arkitektur

 - **Inheritance och Polymorphism**: Fordonsklasser (`Car`, `SUV`, `Truck`) ärver från basklassen `Vehicle` och implementerat gränssnittet `Rentable`.
 - **Abstraktion**: Användning av abstrakta metoder och gränssnitt för att säkerställa en flexible och utbyggbar design.
 - **Konsolgränssnitt**: Användargränssnitt via komandorad för enkel interaktion.

## Krav 

- Java Development kit (JDK) 8 eler högre.
- En IDE eller textredigerare som stödjer Java (t.ex. IntelliJ IDEA, Eclipse, eller VS Code).

## Så här kör du programmet

1. Klona detta repository:
   ```bash
   https://github.com/SheroqShosho/Avancerad-JAVA24_Sheroq_Shahwan_Uppgift1.git
   cd virtuell-biluthyrning
