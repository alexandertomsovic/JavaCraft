// JavaCraft V2.0
// Created by Alex Tomsovic 
// linktr.ee/alextomsovic

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    String[][] game = {
      {
        "-", "-", "-", "-", "-", "-", "-", "-", "-",  "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-\n"
      },
      
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      }, 
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
      },
      {
        "-", "-", "-", "-", "-", "-", "-", "-", "-",  "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-\n"
      }
    };
    LinkedList<LinkedList<String>> world = new LinkedList<LinkedList<String>>();
    LinkedList<String> inventory = new LinkedList<String>();
    int[] playerpos = {37, 0};
    int whydidihavetomakethisvar = 0;
    int stone = 0;
    int dirt = 0;
    int grass = 0;
    int wood = 0;
    int leaves = 0;
    int emeralds = 0;
    int rubies = 0;
    int coal = 0;
    int pickaxeLvl = 0;
    // for (int x = 0; x < 20; x++) {
    //   for (int y = 0; y < 47; y++) {
    //     print(game[x][y], "blue");
    //   }
    // }
    clear();
    type("Welcome to JavaCraft V2.0! \nThis game was created by Alex Tomsovic! You will see options for movement and actions once you enter the game. Have fun! Press enter to start the game.", "orange");
    scan.nextLine();
    for (int c = 0; c < 75; c++) {
      world.add(c, new LinkedList<String>());
      for (int s = 0; s < rand.nextInt(2) + 4; s++) {
        int shouldOre = rand.nextInt(4);
        if (shouldOre == 0) {
          int whichOre = rand.nextInt(10);
          if (whichOre < 4) {
            world.get(c).addLast("coal");
          }
          else if (whichOre < 8) {
            world.get(c).addLast("ruby");
          }
          else {
            world.get(c).addLast("emerald");
          }
        }
        else {
          world.get(c).addLast("stone");
        }
      }
      for (int d = 0; d < rand.nextInt(2) + 3; d++) {
        world.get(c).addLast("dirt");
      }
      world.get(c).addLast("grass");
      for (int a = 0; a < 18 - world.get(c).size(); a++){
        world.get(c).addLast("air");
      }
      whydidihavetomakethisvar = 18 - world.get(c).size();
      for (int q = 0; q < whydidihavetomakethisvar; q++) {
        world.get(c).addLast("air");
      }
      int treeheight = 0;
      int treespawn = 0;
      if (c == 14) {
        treespawn = rand.nextInt(13)+1;
        treeheight = rand.nextInt(3) + 3;
        for (int t = 1; t <= treeheight; t++) {
          world.get(treespawn).remove(world.get(treespawn).indexOf("grass") + t);
          world.get(treespawn).add(world.get(treespawn).indexOf("grass") + t, "wood");
          if (t == treeheight) {
            world.get(treespawn-1).remove(t + world.get(treespawn).indexOf("grass"));
            world.get(treespawn-1).add(t + world.get(treespawn).indexOf("grass"), "leaves");
            world.get(treespawn+1).remove(t + world.get(treespawn).indexOf("grass"));
            world.get(treespawn+1).add(t + world.get(treespawn).indexOf("grass"), "leaves");
            world.get(treespawn).remove(t+1+world.get(treespawn).indexOf("grass"));
            world.get(treespawn).add(t+1+world.get(treespawn).indexOf("grass"), "leaves");
          }
        }
      }
      if (c == 29) {
        treespawn = rand.nextInt(13)+1+15;
        treeheight = rand.nextInt(3) + 3;
        for (int t = 1; t <= treeheight; t++) {
          world.get(treespawn).remove(world.get(treespawn).indexOf("grass") + t);
          world.get(treespawn).add(world.get(treespawn).indexOf("grass") + t, "wood");
          if (t == treeheight) {
            world.get(treespawn-1).remove(t + world.get(treespawn).indexOf("grass"));
            world.get(treespawn-1).add(t + world.get(treespawn).indexOf("grass"), "leaves");
            world.get(treespawn+1).remove(t + world.get(treespawn).indexOf("grass"));
            world.get(treespawn+1).add(t + world.get(treespawn).indexOf("grass"), "leaves");
            world.get(treespawn).remove(t+1+world.get(treespawn).indexOf("grass"));
            world.get(treespawn).add(t+1+world.get(treespawn).indexOf("grass"), "leaves");
          }
        }
      }
      if (c == 44) {
        while (true) {
          treespawn = rand.nextInt(13)+1+30;
          if (treespawn != 37) {
            break;
          }
        }
        treeheight = rand.nextInt(3) + 3;
        for (int t = 1; t <= treeheight; t++) {
          world.get(treespawn).remove(world.get(treespawn).indexOf("grass") + t);
          world.get(treespawn).add(world.get(treespawn).indexOf("grass") + t, "wood");
          if (t == treeheight) {
            world.get(treespawn-1).remove(t + world.get(treespawn).indexOf("grass"));
            world.get(treespawn-1).add(t + world.get(treespawn).indexOf("grass"), "leaves");
            world.get(treespawn+1).remove(t + world.get(treespawn).indexOf("grass"));
            world.get(treespawn+1).add(t + world.get(treespawn).indexOf("grass"), "leaves");
            world.get(treespawn).remove(t+1+world.get(treespawn).indexOf("grass"));
            world.get(treespawn).add(t+1+world.get(treespawn).indexOf("grass"), "leaves");
          }
        }
      }
      if (c == 59) {
        treespawn = rand.nextInt(13)+1+45;
        treeheight = rand.nextInt(3) + 3;
        for (int t = 1; t <= treeheight; t++) {
          world.get(treespawn).remove(world.get(treespawn).indexOf("grass") + t);
          world.get(treespawn).add(world.get(treespawn).indexOf("grass") + t, "wood");
          if (t == treeheight) {
            world.get(treespawn-1).remove(t + world.get(treespawn).indexOf("grass"));
            world.get(treespawn-1).add(t + world.get(treespawn).indexOf("grass"), "leaves");
            world.get(treespawn+1).remove(t + world.get(treespawn).indexOf("grass"));
            world.get(treespawn+1).add(t + world.get(treespawn).indexOf("grass"), "leaves");
            world.get(treespawn).remove(t+1+world.get(treespawn).indexOf("grass"));
            world.get(treespawn).add(t+1+world.get(treespawn).indexOf("grass"), "leaves");
          }
        }
      }
      if (c == 74) {
        treespawn = rand.nextInt(13)+1+60;
        treeheight = rand.nextInt(3) + 3;
        for (int t = 1; t <= treeheight; t++) {
          world.get(treespawn).remove(world.get(treespawn).indexOf("grass") + t);
          world.get(treespawn).add(world.get(treespawn).indexOf("grass") + t, "wood");
          if (t == treeheight) {
            world.get(treespawn-1).remove(t + world.get(treespawn).indexOf("grass"));
            world.get(treespawn-1).add(t + world.get(treespawn).indexOf("grass"), "leaves");
            world.get(treespawn+1).remove(t + world.get(treespawn).indexOf("grass"));
            world.get(treespawn+1).add(t + world.get(treespawn).indexOf("grass"), "leaves");
            world.get(treespawn).remove(t+1+world.get(treespawn).indexOf("grass"));
            world.get(treespawn).add(t+1+world.get(treespawn).indexOf("grass"), "leaves");
          }
        }
      }
      if (c == 37) {
        world.get(c).remove(world.get(c).indexOf("grass") + 1);
        world.get(c).add(world.get(c).indexOf("grass") + 1, "player");
        playerpos[1] = world.get(c).indexOf("player");
      }
    }
    game = update(world, game, playerpos);
    clear();
    boolean jumpedOnce = false;
    while (true) {
      for (int x = 0; x < 20; x++) {
        for (int y = 0; y < 47; y++) {
          if (game[x][y].equalsIgnoreCase("G")) {
            print(game[x][y], "green");
          }
          else if (game[x][y].equalsIgnoreCase("D")) {
            print(game[x][y], "brown");
          }
          else if (game[x][y].equalsIgnoreCase("S")) {
            print(game[x][y], "gray");
          }
          else if (game[x][y].equalsIgnoreCase("W")) {
            print(game[x][y], "cyan");
          }
          else if (game[x][y].equalsIgnoreCase("L")) {
            print(game[x][y], "pink");
          }
          else if (game[x][y].equalsIgnoreCase("C")) {
            print(game[x][y], "black");
          }
          else if (game[x][y].equalsIgnoreCase("E")) {
            print(game[x][y], "darkgreen");
          }
          else if (game[x][y].equalsIgnoreCase("R")) {
            print(game[x][y], "red");
          }
          else {
            print(game[x][y], "blue");
          }
        }
      }
      print("X: " + playerpos[0] + ", Y: " + playerpos[1], "orange");
      dirt = 0;
      grass = 0;
      stone = 0;
      wood = 0;
      leaves = 0;
      rubies = 0;
      emeralds = 0;
      coal = 0;
      for (int ploop = 0; ploop < inventory.size(); ploop++) {
        if (inventory.get(ploop).equalsIgnoreCase("dirt")) {
          dirt += 1;
        }
        if (inventory.get(ploop).equalsIgnoreCase("stone")) {
          stone += 1;
        }
        if (inventory.get(ploop).equalsIgnoreCase("grass")) {
          grass += 1;
        }
        if (inventory.get(ploop).equalsIgnoreCase("wood")) {
          wood += 1;
        }
        if (inventory.get(ploop).equalsIgnoreCase("leaves")) {
          leaves += 1;
        }
        if (inventory.get(ploop).equalsIgnoreCase("ruby")) {
          rubies += 1;
        }
        if (inventory.get(ploop).equalsIgnoreCase("emerald")) {
          emeralds += 1;
        }
        if (inventory.get(ploop).equalsIgnoreCase("coal")) {
          coal += 1;
        }
      }
      print("\nInventory = [", "orange");
      if (dirt > 0) {
        print("(" + dirt + " dirt)", "orange");
      }
      if (grass > 0) {
        print("(" + grass + " grass)", "orange");
      }
      if (stone > 0) {
        print("(" + stone + " stone)", "orange");
      }
      if (wood > 0) {
        print("(" + wood + " wood)", "orange");
      }
      if (leaves > 0) {
        print("(" + leaves + " leaves)", "orange");
      }
      if (rubies > 0) {
        print("(" + rubies + " rubies)", "orange");
      }
      if (coal > 0) {
        print("(" + coal + " coal)", "orange");
      }
      if (emeralds > 0) {
        print("(" + emeralds + " emeralds)", "orange");
      }
      print("]\n", "orange");
      if (pickaxeLvl == 0) {
        print("Current pickaxe: [FIST PICKAXE] Can break: dirt, wood, and leaves.\n", "orange");
      }
      else if (pickaxeLvl == 1) {
        print("Current pickaxe: [WOODEN PICKAXE] Can break: dirt, wood, stone, coal, and leaves.\n", "orange");
      }
      else if (pickaxeLvl == 2) {
        print("Current pickaxe: [STONE PICKAXE] Can break: dirt, wood, stone, coal, rubies, and leaves.\n", "orange");
      }
      else {
        print("Current pickaxe: [RUBY PICKAXE] Can break: dirt, wood, stone, coal, rubies, emeralds, and leaves.\n", "orange");
      }
      boolean canMoveLeft = false;
      boolean canMoveRight = false;
      boolean canJumpUp = false;
      boolean canBreakLeft = false;
      boolean canBreakRight = false;
      boolean canBreakUp = false;
      boolean canBreakDown = false;
      boolean canPlaceLeft = false;
      boolean canPlaceRight = false;
      boolean canPlaceUp = false;
      boolean canPlaceDown = false;
      if (!(playerpos[0] == 0)) {
        if (world.get(playerpos[0]-1).get(playerpos[1]).equalsIgnoreCase("air")) {
          print(" L. Move left", "orange");
          canMoveLeft = true;
        }
      }
      if (!(playerpos[0] == 74)) {
        if (world.get(playerpos[0]+1).get(playerpos[1]).equalsIgnoreCase("air")) {
          print(" R. Move right", "orange");
          canMoveRight = true;
        }
      }
      if (!(playerpos[1] == 17)) {
        if (world.get(playerpos[0]).get(playerpos[1]+1).equalsIgnoreCase("air") && jumpedOnce == false) {
          print(" J. Jump up", "orange");
          canJumpUp = true;
        }
      }
      if (!(playerpos[0] == 0)) {
        if (!world.get(playerpos[0]-1).get(playerpos[1]).equalsIgnoreCase("air")) {
          boolean lelz1 = false;
          if (world.get(playerpos[0]-1).get(playerpos[1]).equalsIgnoreCase("emerald")) {
            if (pickaxeLvl == 3) {
              lelz1 = true;
            }
          }
          else if (world.get(playerpos[0]-1).get(playerpos[1]).equalsIgnoreCase("ruby")) {
            if (pickaxeLvl >= 2) {
              lelz1 = true;
            }
          }
          else if (world.get(playerpos[0]-1).get(playerpos[1]).equalsIgnoreCase("stone") || world.get(playerpos[0]-1).get(playerpos[1]).equalsIgnoreCase("coal")) {
            if (pickaxeLvl >= 1) {
              lelz1 = true;
            }
          }
          else {
            lelz1 = true;
          }
          if (lelz1 == true) {
            print(" BL. Break left block", "orange");
            canBreakLeft = true;
          }
        }
      }
      if (!(playerpos[0] == 74)) {
        if (!world.get(playerpos[0]+1).get(playerpos[1]).equalsIgnoreCase("air")) {
          boolean lelz2 = false;
          if (world.get(playerpos[0]+1).get(playerpos[1]).equalsIgnoreCase("emerald")) {
            if (pickaxeLvl == 3) {
              lelz2 = true;
            }
          }
          else if (world.get(playerpos[0]+1).get(playerpos[1]).equalsIgnoreCase("ruby")) {
            if (pickaxeLvl >= 2) {
              lelz2 = true;
            }
          }
          else if (world.get(playerpos[0]+1).get(playerpos[1]).equalsIgnoreCase("stone") || world.get(playerpos[0]+1).get(playerpos[1]).equalsIgnoreCase("coal")) {
            if (pickaxeLvl >= 1) {
              lelz2 = true;
            }
          }
          else {
            lelz2 = true;
          }
          if (lelz2 == true) {
            print(" BR. Break right block", "orange");
            canBreakRight = true;
          }
        }
      }
      if (!(playerpos[1] == 17)) {
        if (!world.get(playerpos[0]).get(playerpos[1]+1).equalsIgnoreCase("air")) {
          boolean lelz3 = false;
          if (world.get(playerpos[0]).get(playerpos[1]+1).equalsIgnoreCase("emerald")) {
            if (pickaxeLvl == 3) {
              lelz3 = true;
            }
          }
          else if (world.get(playerpos[0]).get(playerpos[1]+1).equalsIgnoreCase("ruby")) {
            if (pickaxeLvl >= 2) {
              lelz3 = true;
            }
          }
          else if (world.get(playerpos[0]).get(playerpos[1]+1).equalsIgnoreCase("stone") || world.get(playerpos[0]).get(playerpos[1]+1).equalsIgnoreCase("coal")) {
            if (pickaxeLvl >= 1) {
              lelz3 = true;
            }
          }
          else {
            lelz3 = true;
          }
          if (lelz3 == true) {
            print(" BU. Break block up", "orange");
            canBreakUp = true;
          }
        }
      }
      if (!(playerpos[1] == 0)) {
        if (!world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
          boolean lelz4 = false;
          if (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("emerald")) {
            if (pickaxeLvl == 3) {
              lelz4 = true;
            }
          }
          else if (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("ruby")) {
            if (pickaxeLvl >= 2) {
              lelz4 = true;
            }
          }
          else if (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("stone") || world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("coal")) {
            if (pickaxeLvl >= 1) {
              lelz4 = true;
            }
          }
          else {
            lelz4 = true;
          }
          if (lelz4 == true) {
            print(" BD. Break block down", "orange");
            canBreakDown = true;
          }
        }
      }
      if (!(playerpos[1] == 0)) {
        if (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air") && inventory.size() > 0) {
          print(" PD. Place block down", "orange");
          canPlaceDown = true;
        }
      }
      if (!(playerpos[1] == 17)) {
        if (world.get(playerpos[0]).get(playerpos[1]+1).equalsIgnoreCase("air") && inventory.size() > 0) {
          print(" PU. Place block up", "orange");
          canPlaceUp = true;
        }
      }
      if (!(playerpos[0] == 74)) {
        if (world.get(playerpos[0]+1).get(playerpos[1]).equalsIgnoreCase("air") && inventory.size() > 0) {
          print(" PR. Place right block", "orange");
          canPlaceRight = true;
        }
      }
      if (!(playerpos[0] == 0)) {
        if (world.get(playerpos[0]-1).get(playerpos[1]).equalsIgnoreCase("air") && inventory.size() > 0) {
          print(" PL. Place left block", "orange");
          canPlaceLeft = true;
        }
      }
      print(" C. Craft items", "orange");
      type("\nEnter your input:\n", "orange");
      String move = scan.nextLine();
      if (move.equalsIgnoreCase("L") && canMoveLeft == true) {
        jumpedOnce = false;
        world.get(playerpos[0]).remove(playerpos[1]);
        world.get(playerpos[0]).add(playerpos[1], "air");
        world.get(playerpos[0]-1).remove(playerpos[1]);
        world.get(playerpos[0]-1).add(playerpos[1], "player");
        playerpos[0] -= 1;
        try {
        while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
          world.get(playerpos[0]).remove(playerpos[1]);
          world.get(playerpos[0]).add(playerpos[1], "air");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "player");
          playerpos[1] -= 1;
        }
        } catch (Exception e) {

        }
      }
      if (move.equalsIgnoreCase("R") && canMoveRight == true) {
        jumpedOnce = false;
        world.get(playerpos[0]).remove(playerpos[1]);
        world.get(playerpos[0]).add(playerpos[1], "air");
        world.get(playerpos[0]+1).remove(playerpos[1]);
        world.get(playerpos[0]+1).add(playerpos[1], "player");
        playerpos[0] += 1;
        try {
        while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
          world.get(playerpos[0]).remove(playerpos[1]);
          world.get(playerpos[0]).add(playerpos[1], "air");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "player");
          playerpos[1] -= 1;
        }
        } catch (Exception e) {

        }
      }
      if (move.equalsIgnoreCase("J") && canJumpUp == true) {
        jumpedOnce = true;
        world.get(playerpos[0]).remove(playerpos[1]);
        world.get(playerpos[0]).add(playerpos[1], "air");
        world.get(playerpos[0]).remove(playerpos[1]+1);
        world.get(playerpos[0]).add(playerpos[1]+1, "player");
        playerpos[1] += 1;
      }
      if (move.equalsIgnoreCase("BL") && canBreakLeft == true) {
        jumpedOnce = false;
        inventory.add(world.get(playerpos[0]-1).get(playerpos[1]));
        world.get(playerpos[0]-1).remove(playerpos[1]);
        world.get(playerpos[0]-1).add(playerpos[1], "air");
        try {
        while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
          world.get(playerpos[0]).remove(playerpos[1]);
          world.get(playerpos[0]).add(playerpos[1], "air");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "player");
          playerpos[1] -= 1;
        }
        } catch (Exception e) {
          
        }
      }
      if (move.equalsIgnoreCase("BR") && canBreakRight == true) {
        jumpedOnce = false;
        inventory.add(world.get(playerpos[0]+1).get(playerpos[1]));
        world.get(playerpos[0]+1).remove(playerpos[1]);
        world.get(playerpos[0]+1).add(playerpos[1], "air");
        try {
        while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
          world.get(playerpos[0]).remove(playerpos[1]);
          world.get(playerpos[0]).add(playerpos[1], "air");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "player");
          playerpos[1] -= 1;
        }
        } catch (Exception e) {

        }
      }
      if (move.equalsIgnoreCase("BU") && canBreakUp == true) {
        jumpedOnce = false;
        inventory.add(world.get(playerpos[0]).get(playerpos[1]+1));
        world.get(playerpos[0]).remove(playerpos[1]+1);
        world.get(playerpos[0]).add(playerpos[1]+1, "air");
        try {
        while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
          world.get(playerpos[0]).remove(playerpos[1]);
          world.get(playerpos[0]).add(playerpos[1], "air");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "player");
          playerpos[1] -= 1;
        }
        } catch (Exception e) {

        }
      }
      if (move.equalsIgnoreCase("BD") && canBreakDown == true) {
        jumpedOnce = false;
        inventory.add(world.get(playerpos[0]).get(playerpos[1]-1));
        world.get(playerpos[0]).remove(playerpos[1]-1);
        world.get(playerpos[0]).add(playerpos[1]-1, "air");
        try {
        while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
          world.get(playerpos[0]).remove(playerpos[1]);
          world.get(playerpos[0]).add(playerpos[1], "air");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "player");
          playerpos[1] -= 1;
        }
        } catch (Exception e) {

        }
      }
      if (move.equalsIgnoreCase("PU") && canPlaceUp == true) {
        print("What block do you want to place? D for dirt, G for grass, W for wood, L for leaves and S for stone: ", "orange");
        String wTp = scan.nextLine();
        if (wTp.equalsIgnoreCase("d") && dirt > 0) {
          inventory.remove("dirt");
          world.get(playerpos[0]).remove(playerpos[1]+1);
          world.get(playerpos[0]).add(playerpos[1]+1, "dirt");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("g") && grass > 0) {
          inventory.remove("grass");
          world.get(playerpos[0]).remove(playerpos[1]+1);
          world.get(playerpos[0]).add(playerpos[1]+1, "grass");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("s") && stone > 0) {
          inventory.remove("stone");
          world.get(playerpos[0]).remove(playerpos[1]+1);
          world.get(playerpos[0]).add(playerpos[1]+1, "stone");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("w") && wood > 0) {
          inventory.remove("wood");
          world.get(playerpos[0]).remove(playerpos[1]+1);
          world.get(playerpos[0]).add(playerpos[1]+1, "wood");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("l") && leaves > 0) {
          inventory.remove("leaves");
          world.get(playerpos[0]).remove(playerpos[1]+1);
          world.get(playerpos[0]).add(playerpos[1]+1, "leaves");
                  jumpedOnce = false;
        }
        else {
          
        }
        try {
        while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
          world.get(playerpos[0]).remove(playerpos[1]);
          world.get(playerpos[0]).add(playerpos[1], "air");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "player");
          playerpos[1] -= 1;
        }
        } catch (Exception e) {

        }
      }
      if (move.equalsIgnoreCase("PR") && canPlaceRight == true) {
        print("What block do you want to place? D for dirt, G for grass, W for wood, L for leaves and S for stone: ", "orange");
        String wTp = scan.nextLine();
        if (wTp.equalsIgnoreCase("d") && dirt > 0) {
          inventory.remove("dirt");
          world.get(playerpos[0]+1).remove(playerpos[1]);
          world.get(playerpos[0]+1).add(playerpos[1], "dirt");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("g") && grass > 0) {
          inventory.remove("grass");
          world.get(playerpos[0]+1).remove(playerpos[1]);
          world.get(playerpos[0]+1).add(playerpos[1], "grass");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("s") && stone > 0) {
          inventory.remove("stone");
          world.get(playerpos[0]+1).remove(playerpos[1]);
          world.get(playerpos[0]+1).add(playerpos[1], "stone");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("w") && wood > 0) {
          inventory.remove("wood");
          world.get(playerpos[0]+1).remove(playerpos[1]);
          world.get(playerpos[0]+1).add(playerpos[1], "wood");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("l") && leaves > 0) {
          inventory.remove("leaves");
          world.get(playerpos[0]+1).remove(playerpos[1]);
          world.get(playerpos[0]+1).add(playerpos[1], "leaves");
                  jumpedOnce = false;
        }
        else {
          
        }
        try {
        while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
          world.get(playerpos[0]).remove(playerpos[1]);
          world.get(playerpos[0]).add(playerpos[1], "air");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "player");
          playerpos[1] -= 1;
        }
        } catch (Exception e) {

        }
      }
      if (move.equalsIgnoreCase("PL") && canPlaceLeft == true) {
        print("What block do you want to place? D for dirt, G for grass, W for wood, L for leaves and S for stone: ", "orange");
        String wTp = scan.nextLine();
        if (wTp.equalsIgnoreCase("d") && dirt > 0) {
          inventory.remove("dirt");
          world.get(playerpos[0]-1).remove(playerpos[1]);
          world.get(playerpos[0]-1).add(playerpos[1], "dirt");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("g") && grass > 0) {
          inventory.remove("grass");
          world.get(playerpos[0]-1).remove(playerpos[1]);
          world.get(playerpos[0]-1).add(playerpos[1], "grass");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("s") && stone > 0) {
          inventory.remove("stone");
          world.get(playerpos[0]-1).remove(playerpos[1]);
          world.get(playerpos[0]-1).add(playerpos[1], "stone");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("w") && wood > 0) {
          inventory.remove("wood");
          world.get(playerpos[0]-1).remove(playerpos[1]);
          world.get(playerpos[0]-1).add(playerpos[1], "wood");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("l") && leaves > 0) {
          inventory.remove("leaves");
          world.get(playerpos[0]-1).remove(playerpos[1]);
          world.get(playerpos[0]-1).add(playerpos[1], "leaves");
                  jumpedOnce = false;
        }
        else {
          
        }
        try {
        while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
          world.get(playerpos[0]).remove(playerpos[1]);
          world.get(playerpos[0]).add(playerpos[1], "air");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "player");
          playerpos[1] -= 1;
        }
        } catch (Exception e) {

        }
      }
      if (move.equalsIgnoreCase("PD") && canPlaceDown == true) {
        print("What block do you want to place? D for dirt, G for grass, W for wood, L for leaves and S for stone: ", "orange");
        String wTp = scan.nextLine();
        if (wTp.equalsIgnoreCase("d") && dirt > 0) {
          inventory.remove("dirt");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "dirt");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("g") && grass > 0) {
          inventory.remove("grass");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "grass");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("s") && stone > 0) {
          inventory.remove("stone");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "stone");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("w") && wood > 0) {
          inventory.remove("wood");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "wood");
                  jumpedOnce = false;
        }
        else if (wTp.equalsIgnoreCase("l") && leaves > 0) {
          inventory.remove("leaves");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "leaves");
                  jumpedOnce = false;
        }
        else {
          
        }
        try {
        while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
          world.get(playerpos[0]).remove(playerpos[1]);
          world.get(playerpos[0]).add(playerpos[1], "air");
          world.get(playerpos[0]).remove(playerpos[1]-1);
          world.get(playerpos[0]).add(playerpos[1]-1, "player");
          playerpos[1] -= 1;
        }
        } catch (Exception e) {
          
        }
      }
      if (move.equalsIgnoreCase("C")) {
        print("What craft do you want to complete?\n", "orange");
        print("A. 2 wood for a wood pickaxe (pickaxe level 1)\n", "orange");
        print("B. 2 wood, 2 stone for a stone pickaxe (pickaxe level 2)\n", "orange");
        print("C. 2 wood, 2 rubies for a ruby pickaxe (pickaxe level 3)\n", "orange");
        type("Enter your input: ", "orange");
        String whatCraft = scan.nextLine();
        if (whatCraft.equalsIgnoreCase("A")) {
          if (wood >= 2) {
            inventory.remove("wood");
            inventory.remove("wood");
            pickaxeLvl = 1;
            type("You bought a wood pickaxe!", "orange");
          }
          else {
            type("You didn't have enough resources. Crafting canceled.", "orange");
          }
        }
        if (whatCraft.equalsIgnoreCase("B")) {
          if (wood >= 2) {
            if (stone >= 2) {
              inventory.remove("wood");
              inventory.remove("wood");
              inventory.remove("stone");
              inventory.remove("stone");
              pickaxeLvl = 2;
              type("You bought a stone pickaxe!", "orange");
            }
          }
          else {
            type("You didn't have enough resources. Crafting canceled.", "orange");
          }
        }
        if (whatCraft.equalsIgnoreCase("C")) {
          if (wood >= 2) {
            if (rubies >= 2) {
              inventory.remove("wood");
              inventory.remove("wood");
              inventory.remove("rubies");
              inventory.remove("rubies");
              pickaxeLvl = 3;
              type("You bought a ruby pickaxe!", "orange");
            }
          }
          else {
            type("You didn't have enough resources. Crafting canceled.", "orange");
          }
        }
      }
      clear();
      game = update(world, game, playerpos);
    }
  }
  public static void clear() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
  public static void sleep(int time) {
    try {
        TimeUnit.SECONDS.sleep(time);
      }
      catch (Exception e) {

      }
  }
  public static void type(String output, String color) {
    for (int i = 0; i<output.length(); i++) {
      char c = output.charAt(i);
      if (color.equalsIgnoreCase("blue")) {
        System.out.print("\33[0;34m" + c);
      }
      else if (color.equalsIgnoreCase("red")) {
        System.out.print("\033[0;31m" + c);
      }
      else if (color.equalsIgnoreCase("cyan")) {
        System.out.print("\033[1;36m" + c);
      }
      else if (color.equalsIgnoreCase("green")) {
        System.out.print("\033[0;32m" + c);
      }
      else if (color.equalsIgnoreCase("pink")) {
        System.out.print("\033[1;31m" + c);
      }
      else if (color.equalsIgnoreCase("orange")) {
        System.out.print("\033[0;33m" + c);
      }
      else if (color.equalsIgnoreCase("brown")) {
        System.out.print("\033[38;5;131m" + c);
      }
      else if (color.equalsIgnoreCase("gray")) {
        System.out.print("\033[38;5;5m" + c);
      }
      else if (color.equalsIgnoreCase("darkgreen")) {
        System.out.print("\033[38;5;155m" + c);
      }
      else if (color.equalsIgnoreCase("black")) {
        System.out.print("\033[0;30m" + c);
      }
      else {
        System.out.print("\u001b[0m" + c);
      }
      try {
        TimeUnit.MILLISECONDS.sleep(30);
      }
      catch (Exception e) {

      }
    }
  }
  public static void print(String output, String color) {
    for (int i = 0; i<output.length(); i++) {
      char c = output.charAt(i);
      if (color.equalsIgnoreCase("blue")) {
        System.out.print("\33[0;34m" + c);
      }
      else if (color.equalsIgnoreCase("red")) {
        System.out.print("\033[0;31m" + c);
      }
      else if (color.equalsIgnoreCase("cyan")) {
        System.out.print("\033[1;36m" + c);
      }
      else if (color.equalsIgnoreCase("green")) {
        System.out.print("\033[0;32m" + c);
      }
      else if (color.equalsIgnoreCase("pink")) {
        System.out.print("\033[1;31m" + c);
      }
      else if (color.equalsIgnoreCase("orange")) {
        System.out.print("\033[0;33m" + c);
      }
      else if (color.equalsIgnoreCase("brown")) {
        System.out.print("\033[38;5;131m" + c);
      }
      else if (color.equalsIgnoreCase("gray")) {
        System.out.print("\033[38;5;5m" + c);
      }
      else if (color.equalsIgnoreCase("darkgreen")) {
        System.out.print("\033[38;5;155m" + c);
      }
      else if (color.equalsIgnoreCase("black")) {
        System.out.print("\033[0;30m" + c);
      }
      else {
        System.out.print("\u001b[0m" + c);
      }
    }
  }
  public static String[][] update(LinkedList<LinkedList<String>> blocks, String[][] gameboard, int[] playpos) {
    String[][] air = {
      {
        " ", " ", " "
      },
      {
        " ", " ", " "
      },
      {
        " ", " ", " "
      }
    };
    String[][] grass = {
      {
        "G", "G", "G"
      },
      {
        "D", "D", "D"
      },
      {
        "D", "D", "D"
      }
    };
    String[][] dirt = {
      {
        "D", "D", "D"
      },
      {
        "D", "D", "D"
      },
      {
        "D", "D", "D"
      }
    };
    String[][] stone = {
      {
        "S", "S", "S"
      },
      {
        "S", "S", "S"
      },
      {
        "S", "S", "S"
      }
    };
    String[][] player = {
      {
        " ", "O", " "
      },
      {
        "\\", "|", "/"
      },
      {
        "/", " ", "\\"
      }
    };
    String[][] wood = {
      {
        "W", "W", "W"
      },
      {
        "W", "W", "W"
      },
      {
        "W", "W", "W"
      }
    };
    String[][] leaves = {
      {
        "L", "L", "L"
      },
      {
        "L", "L", "L"
      },
      {
        "L", "L", "L"
      }
    };
    String[][] emeralds = {
      {
        "E", "E", "E"
      },
      {
        "E", "E", "E"
      },
      {
        "E", "E", "E"
      }
    };
    String[][] rubies = {
      {
        "R", "R", "R"
      },
      {
        "R", "R", "R"
      },
      {
        "R", "R", "R"
      }
    };
    String[][] coal = {
      {
        "C", "C", "C"
      },
      {
        "C", "C", "C"
      },
      {
        "C", "C", "C"
      }
    };
    int xmin = 0;
    int xmax = 0;
    if (playpos[0] < 15) {
      xmin = 0;
      xmax = 15;
    }
    else if (playpos[0] < 30) {
      xmin = 15;
      xmax = 30;
    }
    else if (playpos[0] < 45) {
      xmin = 30;
      xmax = 45;
    }
    else if (playpos[0] < 60) {
      xmin = 45;
      xmax = 60;
    }
    else {
      xmin = 60;
      xmax = 75;
    }
    int x = 0;
    int ymin = 0;
    int ymax = 0;
    if (playpos[1] < 6) {
      ymin = 0;
      ymax = 6;
    }
    else if (playpos[1] < 12) {
      ymin = 6;
      ymax = 12;
    }
    else {
      ymin = 12;
      ymax = 18;
    }
    int y = 0;
    for (int xx = xmin; xx < xmax; xx++) {
      if (xx < 15) {
        x = xx;
      }
      else if (xx < 30) {
        x = xx - 15;
      }
      else if (xx < 45) {
        x = xx - 30;
      }
      else if (xx < 60) {
        x = xx - 45;
      }
      else {
        x = xx - 60;
      }
      for (int yy = ymin; yy < ymax; yy++) {
          if (yy < 6) {
            y = yy;
          }
          else if (yy < 12) {
            y = yy - 6;
          }
          else {
            y = yy - 12;
          }
          if (blocks.get(xx).get(yy).equalsIgnoreCase("grass")) {
            if (y == 0) {
              gameboard[16][x * 3 + 1] = grass[0][0];
              gameboard[16][x * 3 + 2] = grass[0][1];
              gameboard[16][x * 3 + 3] = grass[0][2];
              gameboard[17][x * 3 + 1] = grass[1][0];
              gameboard[17][x * 3 + 2] = grass[1][1];
              gameboard[17][x * 3 + 3] = grass[1][2];
              gameboard[18][x * 3 + 1] = grass[2][0];
              gameboard[18][x * 3 + 2] = grass[2][1];
              gameboard[18][x * 3 + 3] = grass[2][2];
            }
            else if (y == 1) {
              gameboard[13][x * 3 + 1] = grass[0][0];
              gameboard[13][x * 3 + 2] = grass[0][1];
              gameboard[13][x * 3 + 3] = grass[0][2];
              gameboard[14][x * 3 + 1] = grass[1][0];
              gameboard[14][x * 3 + 2] = grass[1][1];
              gameboard[14][x * 3 + 3] = grass[1][2];
              gameboard[15][x * 3 + 1] = grass[2][0];
              gameboard[15][x * 3 + 2] = grass[2][1];
              gameboard[15][x * 3 + 3] = grass[2][2];
            }
            else if (y == 2) {
              gameboard[10][x * 3 + 1] = grass[0][0];
              gameboard[10][x * 3 + 2] = grass[0][1];
              gameboard[10][x * 3 + 3] = grass[0][2];
              gameboard[11][x * 3 + 1] = grass[1][0];
              gameboard[11][x * 3 + 2] = grass[1][1];
              gameboard[11][x * 3 + 3] = grass[1][2];
              gameboard[12][x * 3 + 1] = grass[2][0];
              gameboard[12][x * 3 + 2] = grass[2][1];
              gameboard[12][x * 3 + 3] = grass[2][2];
            }
            else if (y == 3) {
              gameboard[7][x * 3 + 1] = grass[0][0];
              gameboard[7][x * 3 + 2] = grass[0][1];
              gameboard[7][x * 3 + 3] = grass[0][2];
              gameboard[8][x * 3 + 1] = grass[1][0];
              gameboard[8][x * 3 + 2] = grass[1][1];
              gameboard[8][x * 3 + 3] = grass[1][2];
              gameboard[9][x * 3 + 1] = grass[2][0];
              gameboard[9][x * 3 + 2] = grass[2][1];
              gameboard[9][x * 3 + 3] = grass[2][2];
            }
            else if (y == 4) {
              gameboard[4][x * 3 + 1] = grass[0][0];
              gameboard[4][x * 3 + 2] = grass[0][1];
              gameboard[4][x * 3 + 3] = grass[0][2];
              gameboard[5][x * 3 + 1] = grass[1][0];
              gameboard[5][x * 3 + 2] = grass[1][1];
              gameboard[5][x * 3 + 3] = grass[1][2];
              gameboard[6][x * 3 + 1] = grass[2][0];
              gameboard[6][x * 3 + 2] = grass[2][1];
              gameboard[6][x * 3 + 3] = grass[2][2];
            }
            else {
              gameboard[1][x * 3 + 1] = grass[0][0];
              gameboard[1][x * 3 + 2] = grass[0][1];
              gameboard[1][x * 3 + 3] = grass[0][2];
              gameboard[2][x * 3 + 1] = grass[1][0];
              gameboard[2][x * 3 + 2] = grass[1][1];
              gameboard[2][x * 3 + 3] = grass[1][2];
              gameboard[3][x * 3 + 1] = grass[2][0];
              gameboard[3][x * 3 + 2] = grass[2][1];
              gameboard[3][x * 3 + 3] = grass[2][2];
            }
          }
          else if (blocks.get(xx).get(yy).equalsIgnoreCase("dirt")) {
            if (y == 0) {
              gameboard[16][x * 3 + 1] = dirt[0][0];
              gameboard[16][x * 3 + 2] = dirt[0][1];
              gameboard[16][x * 3 + 3] = dirt[0][2];
              gameboard[17][x * 3 + 1] = dirt[1][0];
              gameboard[17][x * 3 + 2] = dirt[1][1];
              gameboard[17][x * 3 + 3] = dirt[1][2];
              gameboard[18][x * 3 + 1] = dirt[2][0];
              gameboard[18][x * 3 + 2] = dirt[2][1];
              gameboard[18][x * 3 + 3] = dirt[2][2];
            }
            else if (y == 1) {
              gameboard[13][x * 3 + 1] = dirt[0][0];
              gameboard[13][x * 3 + 2] = dirt[0][1];
              gameboard[13][x * 3 + 3] = dirt[0][2];
              gameboard[14][x * 3 + 1] = dirt[1][0];
              gameboard[14][x * 3 + 2] = dirt[1][1];
              gameboard[14][x * 3 + 3] = dirt[1][2];
              gameboard[15][x * 3 + 1] = dirt[2][0];
              gameboard[15][x * 3 + 2] = dirt[2][1];
              gameboard[15][x * 3 + 3] = dirt[2][2];
            }
            else if (y == 2) {
              gameboard[10][x * 3 + 1] = dirt[0][0];
              gameboard[10][x * 3 + 2] = dirt[0][1];
              gameboard[10][x * 3 + 3] = dirt[0][2];
              gameboard[11][x * 3 + 1] = dirt[1][0];
              gameboard[11][x * 3 + 2] = dirt[1][1];
              gameboard[11][x * 3 + 3] = dirt[1][2];
              gameboard[12][x * 3 + 1] = dirt[2][0];
              gameboard[12][x * 3 + 2] = dirt[2][1];
              gameboard[12][x * 3 + 3] = dirt[2][2];
            }
            else if (y == 3) {
              gameboard[7][x * 3 + 1] = dirt[0][0];
              gameboard[7][x * 3 + 2] = dirt[0][1];
              gameboard[7][x * 3 + 3] = dirt[0][2];
              gameboard[8][x * 3 + 1] = dirt[1][0];
              gameboard[8][x * 3 + 2] = dirt[1][1];
              gameboard[8][x * 3 + 3] = dirt[1][2];
              gameboard[9][x * 3 + 1] = dirt[2][0];
              gameboard[9][x * 3 + 2] = dirt[2][1];
              gameboard[9][x * 3 + 3] = dirt[2][2];
            }
            else if (y == 4) {
              gameboard[4][x * 3 + 1] = dirt[0][0];
              gameboard[4][x * 3 + 2] = dirt[0][1];
              gameboard[4][x * 3 + 3] = dirt[0][2];
              gameboard[5][x * 3 + 1] = dirt[1][0];
              gameboard[5][x * 3 + 2] = dirt[1][1];
              gameboard[5][x * 3 + 3] = dirt[1][2];
              gameboard[6][x * 3 + 1] = dirt[2][0];
              gameboard[6][x * 3 + 2] = dirt[2][1];
              gameboard[6][x * 3 + 3] = dirt[2][2];
            }
            else {
              gameboard[1][x * 3 + 1] = dirt[0][0];
              gameboard[1][x * 3 + 2] = dirt[0][1];
              gameboard[1][x * 3 + 3] = dirt[0][2];
              gameboard[2][x * 3 + 1] = dirt[1][0];
              gameboard[2][x * 3 + 2] = dirt[1][1];
              gameboard[2][x * 3 + 3] = dirt[1][2];
              gameboard[3][x * 3 + 1] = dirt[2][0];
              gameboard[3][x * 3 + 2] = dirt[2][1];
              gameboard[3][x * 3 + 3] = dirt[2][2];
            }
          }
          else if (blocks.get(xx).get(yy).equalsIgnoreCase("stone")) {
            if (y == 0) {
              gameboard[16][x * 3 + 1] = stone[0][0];
              gameboard[16][x * 3 + 2] = stone[0][1];
              gameboard[16][x * 3 + 3] = stone[0][2];
              gameboard[17][x * 3 + 1] = stone[1][0];
              gameboard[17][x * 3 + 2] = stone[1][1];
              gameboard[17][x * 3 + 3] = stone[1][2];
              gameboard[18][x * 3 + 1] = stone[2][0];
              gameboard[18][x * 3 + 2] = stone[2][1];
              gameboard[18][x * 3 + 3] = stone[2][2];
            }
            else if (y == 1) {
              gameboard[13][x * 3 + 1] = stone[0][0];
              gameboard[13][x * 3 + 2] = stone[0][1];
              gameboard[13][x * 3 + 3] = stone[0][2];
              gameboard[14][x * 3 + 1] = stone[1][0];
              gameboard[14][x * 3 + 2] = stone[1][1];
              gameboard[14][x * 3 + 3] = stone[1][2];
              gameboard[15][x * 3 + 1] = stone[2][0];
              gameboard[15][x * 3 + 2] = stone[2][1];
              gameboard[15][x * 3 + 3] = stone[2][2];
            }
            else if (y == 2) {
              gameboard[10][x * 3 + 1] = stone[0][0];
              gameboard[10][x * 3 + 2] = stone[0][1];
              gameboard[10][x * 3 + 3] = stone[0][2];
              gameboard[11][x * 3 + 1] = stone[1][0];
              gameboard[11][x * 3 + 2] = stone[1][1];
              gameboard[11][x * 3 + 3] = stone[1][2];
              gameboard[12][x * 3 + 1] = stone[2][0];
              gameboard[12][x * 3 + 2] = stone[2][1];
              gameboard[12][x * 3 + 3] = stone[2][2];
            }
            else if (y == 3) {
              gameboard[7][x * 3 + 1] = stone[0][0];
              gameboard[7][x * 3 + 2] = stone[0][1];
              gameboard[7][x * 3 + 3] = stone[0][2];
              gameboard[8][x * 3 + 1] = stone[1][0];
              gameboard[8][x * 3 + 2] = stone[1][1];
              gameboard[8][x * 3 + 3] = stone[1][2];
              gameboard[9][x * 3 + 1] = stone[2][0];
              gameboard[9][x * 3 + 2] = stone[2][1];
              gameboard[9][x * 3 + 3] = stone[2][2];
            }
            else if (y == 4) {
              gameboard[4][x * 3 + 1] = stone[0][0];
              gameboard[4][x * 3 + 2] = stone[0][1];
              gameboard[4][x * 3 + 3] = stone[0][2];
              gameboard[5][x * 3 + 1] = stone[1][0];
              gameboard[5][x * 3 + 2] = stone[1][1];
              gameboard[5][x * 3 + 3] = stone[1][2];
              gameboard[6][x * 3 + 1] = stone[2][0];
              gameboard[6][x * 3 + 2] = stone[2][1];
              gameboard[6][x * 3 + 3] = stone[2][2];
            }
            else {
              gameboard[1][x * 3 + 1] = stone[0][0];
              gameboard[1][x * 3 + 2] = stone[0][1];
              gameboard[1][x * 3 + 3] = stone[0][2];
              gameboard[2][x * 3 + 1] = stone[1][0];
              gameboard[2][x * 3 + 2] = stone[1][1];
              gameboard[2][x * 3 + 3] = stone[1][2];
              gameboard[3][x * 3 + 1] = stone[2][0];
              gameboard[3][x * 3 + 2] = stone[2][1];
              gameboard[3][x * 3 + 3] = stone[2][2];
            }
          }
          else if (blocks.get(xx).get(yy).equalsIgnoreCase("player")) {
            if (y == 0) {
              gameboard[16][x * 3 + 1] = player[0][0];
              gameboard[16][x * 3 + 2] = player[0][1];
              gameboard[16][x * 3 + 3] = player[0][2];
              gameboard[17][x * 3 + 1] = player[1][0];
              gameboard[17][x * 3 + 2] = player[1][1];
              gameboard[17][x * 3 + 3] = player[1][2];
              gameboard[18][x * 3 + 1] = player[2][0];
              gameboard[18][x * 3 + 2] = player[2][1];
              gameboard[18][x * 3 + 3] = player[2][2];
            }
            else if (y == 1) {
              gameboard[13][x * 3 + 1] = player[0][0];
              gameboard[13][x * 3 + 2] = player[0][1];
              gameboard[13][x * 3 + 3] = player[0][2];
              gameboard[14][x * 3 + 1] = player[1][0];
              gameboard[14][x * 3 + 2] = player[1][1];
              gameboard[14][x * 3 + 3] = player[1][2];
              gameboard[15][x * 3 + 1] = player[2][0];
              gameboard[15][x * 3 + 2] = player[2][1];
              gameboard[15][x * 3 + 3] = player[2][2];
            }
            else if (y == 2) {
              gameboard[10][x * 3 + 1] = player[0][0];
              gameboard[10][x * 3 + 2] = player[0][1];
              gameboard[10][x * 3 + 3] = player[0][2];
              gameboard[11][x * 3 + 1] = player[1][0];
              gameboard[11][x * 3 + 2] = player[1][1];
              gameboard[11][x * 3 + 3] = player[1][2];
              gameboard[12][x * 3 + 1] = player[2][0];
              gameboard[12][x * 3 + 2] = player[2][1];
              gameboard[12][x * 3 + 3] = player[2][2];
            }
            else if (y == 3) {
              gameboard[7][x * 3 + 1] = player[0][0];
              gameboard[7][x * 3 + 2] = player[0][1];
              gameboard[7][x * 3 + 3] = player[0][2];
              gameboard[8][x * 3 + 1] = player[1][0];
              gameboard[8][x * 3 + 2] = player[1][1];
              gameboard[8][x * 3 + 3] = player[1][2];
              gameboard[9][x * 3 + 1] = player[2][0];
              gameboard[9][x * 3 + 2] = player[2][1];
              gameboard[9][x * 3 + 3] = player[2][2];
            }
            else if (y == 4) {
              gameboard[4][x * 3 + 1] = player[0][0];
              gameboard[4][x * 3 + 2] = player[0][1];
              gameboard[4][x * 3 + 3] = player[0][2];
              gameboard[5][x * 3 + 1] = player[1][0];
              gameboard[5][x * 3 + 2] = player[1][1];
              gameboard[5][x * 3 + 3] = player[1][2];
              gameboard[6][x * 3 + 1] = player[2][0];
              gameboard[6][x * 3 + 2] = player[2][1];
              gameboard[6][x * 3 + 3] = player[2][2];
            }
            else {
              gameboard[1][x * 3 + 1] = player[0][0];
              gameboard[1][x * 3 + 2] = player[0][1];
              gameboard[1][x * 3 + 3] = player[0][2];
              gameboard[2][x * 3 + 1] = player[1][0];
              gameboard[2][x * 3 + 2] = player[1][1];
              gameboard[2][x * 3 + 3] = player[1][2];
              gameboard[3][x * 3 + 1] = player[2][0];
              gameboard[3][x * 3 + 2] = player[2][1];
              gameboard[3][x * 3 + 3] = player[2][2];
            }
          }
          else if (blocks.get(xx).get(yy).equalsIgnoreCase("air")) {
            if (y == 0) {
              gameboard[16][x * 3 + 1] = air[0][0];
              gameboard[16][x * 3 + 2] = air[0][1];
              gameboard[16][x * 3 + 3] = air[0][2];
              gameboard[17][x * 3 + 1] = air[1][0];
              gameboard[17][x * 3 + 2] = air[1][1];
              gameboard[17][x * 3 + 3] = air[1][2];
              gameboard[18][x * 3 + 1] = air[2][0];
              gameboard[18][x * 3 + 2] = air[2][1];
              gameboard[18][x * 3 + 3] = air[2][2];
            }
            else if (y == 1) {
              gameboard[13][x * 3 + 1] = air[0][0];
              gameboard[13][x * 3 + 2] = air[0][1];
              gameboard[13][x * 3 + 3] = air[0][2];
              gameboard[14][x * 3 + 1] = air[1][0];
              gameboard[14][x * 3 + 2] = air[1][1];
              gameboard[14][x * 3 + 3] = air[1][2];
              gameboard[15][x * 3 + 1] = air[2][0];
              gameboard[15][x * 3 + 2] = air[2][1];
              gameboard[15][x * 3 + 3] = air[2][2];
            }
            else if (y == 2) {
              gameboard[10][x * 3 + 1] = air[0][0];
              gameboard[10][x * 3 + 2] = air[0][1];
              gameboard[10][x * 3 + 3] = air[0][2];
              gameboard[11][x * 3 + 1] = air[1][0];
              gameboard[11][x * 3 + 2] = air[1][1];
              gameboard[11][x * 3 + 3] = air[1][2];
              gameboard[12][x * 3 + 1] = air[2][0];
              gameboard[12][x * 3 + 2] = air[2][1];
              gameboard[12][x * 3 + 3] = air[2][2];
            }
            else if (y == 3) {
              gameboard[7][x * 3 + 1] = air[0][0];
              gameboard[7][x * 3 + 2] = air[0][1];
              gameboard[7][x * 3 + 3] = air[0][2];
              gameboard[8][x * 3 + 1] = air[1][0];
              gameboard[8][x * 3 + 2] = air[1][1];
              gameboard[8][x * 3 + 3] = air[1][2];
              gameboard[9][x * 3 + 1] = air[2][0];
              gameboard[9][x * 3 + 2] = air[2][1];
              gameboard[9][x * 3 + 3] = air[2][2];
            }
            else if (y == 4) {
              gameboard[4][x * 3 + 1] = air[0][0];
              gameboard[4][x * 3 + 2] = air[0][1];
              gameboard[4][x * 3 + 3] = air[0][2];
              gameboard[5][x * 3 + 1] = air[1][0];
              gameboard[5][x * 3 + 2] = air[1][1];
              gameboard[5][x * 3 + 3] = air[1][2];
              gameboard[6][x * 3 + 1] = air[2][0];
              gameboard[6][x * 3 + 2] = air[2][1];
              gameboard[6][x * 3 + 3] = air[2][2];
            }
            else {
              gameboard[1][x * 3 + 1] = air[0][0];
              gameboard[1][x * 3 + 2] = air[0][1];
              gameboard[1][x * 3 + 3] = air[0][2];
              gameboard[2][x * 3 + 1] = air[1][0];
              gameboard[2][x * 3 + 2] = air[1][1];
              gameboard[2][x * 3 + 3] = air[1][2];
              gameboard[3][x * 3 + 1] = air[2][0];
              gameboard[3][x * 3 + 2] = air[2][1];
              gameboard[3][x * 3 + 3] = air[2][2];
            }
          }
          else if (blocks.get(xx).get(yy).equalsIgnoreCase("wood")) {
            if (y == 0) {
              gameboard[16][x * 3 + 1] = wood[0][0];
              gameboard[16][x * 3 + 2] = wood[0][1];
              gameboard[16][x * 3 + 3] = wood[0][2];
              gameboard[17][x * 3 + 1] = wood[1][0];
              gameboard[17][x * 3 + 2] = wood[1][1];
              gameboard[17][x * 3 + 3] = wood[1][2];
              gameboard[18][x * 3 + 1] = wood[2][0];
              gameboard[18][x * 3 + 2] = wood[2][1];
              gameboard[18][x * 3 + 3] = wood[2][2];
            }
            else if (y == 1) {
              gameboard[13][x * 3 + 1] = wood[0][0];
              gameboard[13][x * 3 + 2] = wood[0][1];
              gameboard[13][x * 3 + 3] = wood[0][2];
              gameboard[14][x * 3 + 1] = wood[1][0];
              gameboard[14][x * 3 + 2] = wood[1][1];
              gameboard[14][x * 3 + 3] = wood[1][2];
              gameboard[15][x * 3 + 1] = wood[2][0];
              gameboard[15][x * 3 + 2] = wood[2][1];
              gameboard[15][x * 3 + 3] = wood[2][2];
            }
            else if (y == 2) {
              gameboard[10][x * 3 + 1] = wood[0][0];
              gameboard[10][x * 3 + 2] = wood[0][1];
              gameboard[10][x * 3 + 3] = wood[0][2];
              gameboard[11][x * 3 + 1] = wood[1][0];
              gameboard[11][x * 3 + 2] = wood[1][1];
              gameboard[11][x * 3 + 3] = wood[1][2];
              gameboard[12][x * 3 + 1] = wood[2][0];
              gameboard[12][x * 3 + 2] = wood[2][1];
              gameboard[12][x * 3 + 3] = wood[2][2];
            }
            else if (y == 3) {
              gameboard[7][x * 3 + 1] = wood[0][0];
              gameboard[7][x * 3 + 2] = wood[0][1];
              gameboard[7][x * 3 + 3] = wood[0][2];
              gameboard[8][x * 3 + 1] = wood[1][0];
              gameboard[8][x * 3 + 2] = wood[1][1];
              gameboard[8][x * 3 + 3] = wood[1][2];
              gameboard[9][x * 3 + 1] = wood[2][0];
              gameboard[9][x * 3 + 2] = wood[2][1];
              gameboard[9][x * 3 + 3] = wood[2][2];
            }
            else if (y == 4) {
              gameboard[4][x * 3 + 1] = wood[0][0];
              gameboard[4][x * 3 + 2] = wood[0][1];
              gameboard[4][x * 3 + 3] = wood[0][2];
              gameboard[5][x * 3 + 1] = wood[1][0];
              gameboard[5][x * 3 + 2] = wood[1][1];
              gameboard[5][x * 3 + 3] = wood[1][2];
              gameboard[6][x * 3 + 1] = wood[2][0];
              gameboard[6][x * 3 + 2] = wood[2][1];
              gameboard[6][x * 3 + 3] = wood[2][2];
            }
            else {
              gameboard[1][x * 3 + 1] = wood[0][0];
              gameboard[1][x * 3 + 2] = wood[0][1];
              gameboard[1][x * 3 + 3] = wood[0][2];
              gameboard[2][x * 3 + 1] = wood[1][0];
              gameboard[2][x * 3 + 2] = wood[1][1];
              gameboard[2][x * 3 + 3] = wood[1][2];
              gameboard[3][x * 3 + 1] = wood[2][0];
              gameboard[3][x * 3 + 2] = wood[2][1];
              gameboard[3][x * 3 + 3] = wood[2][2];
            }
          }
          else if (blocks.get(xx).get(yy).equalsIgnoreCase("leaves")) {
            if (y == 0) {
              gameboard[16][x * 3 + 1] = leaves[0][0];
              gameboard[16][x * 3 + 2] = leaves[0][1];
              gameboard[16][x * 3 + 3] = leaves[0][2];
              gameboard[17][x * 3 + 1] = leaves[1][0];
              gameboard[17][x * 3 + 2] = leaves[1][1];
              gameboard[17][x * 3 + 3] = leaves[1][2];
              gameboard[18][x * 3 + 1] = leaves[2][0];
              gameboard[18][x * 3 + 2] = leaves[2][1];
              gameboard[18][x * 3 + 3] = leaves[2][2];
            }
            else if (y == 1) {
              gameboard[13][x * 3 + 1] = leaves[0][0];
              gameboard[13][x * 3 + 2] = leaves[0][1];
              gameboard[13][x * 3 + 3] = leaves[0][2];
              gameboard[14][x * 3 + 1] = leaves[1][0];
              gameboard[14][x * 3 + 2] = leaves[1][1];
              gameboard[14][x * 3 + 3] = leaves[1][2];
              gameboard[15][x * 3 + 1] = leaves[2][0];
              gameboard[15][x * 3 + 2] = leaves[2][1];
              gameboard[15][x * 3 + 3] = leaves[2][2];
            }
            else if (y == 2) {
              gameboard[10][x * 3 + 1] = leaves[0][0];
              gameboard[10][x * 3 + 2] = leaves[0][1];
              gameboard[10][x * 3 + 3] = leaves[0][2];
              gameboard[11][x * 3 + 1] = leaves[1][0];
              gameboard[11][x * 3 + 2] = leaves[1][1];
              gameboard[11][x * 3 + 3] = leaves[1][2];
              gameboard[12][x * 3 + 1] = leaves[2][0];
              gameboard[12][x * 3 + 2] = leaves[2][1];
              gameboard[12][x * 3 + 3] = leaves[2][2];
            }
            else if (y == 3) {
              gameboard[7][x * 3 + 1] = leaves[0][0];
              gameboard[7][x * 3 + 2] = leaves[0][1];
              gameboard[7][x * 3 + 3] = leaves[0][2];
              gameboard[8][x * 3 + 1] = leaves[1][0];
              gameboard[8][x * 3 + 2] = leaves[1][1];
              gameboard[8][x * 3 + 3] = leaves[1][2];
              gameboard[9][x * 3 + 1] = leaves[2][0];
              gameboard[9][x * 3 + 2] = leaves[2][1];
              gameboard[9][x * 3 + 3] = leaves[2][2];
            }
            else if (y == 4) {
              gameboard[4][x * 3 + 1] = leaves[0][0];
              gameboard[4][x * 3 + 2] = leaves[0][1];
              gameboard[4][x * 3 + 3] = leaves[0][2];
              gameboard[5][x * 3 + 1] = leaves[1][0];
              gameboard[5][x * 3 + 2] = leaves[1][1];
              gameboard[5][x * 3 + 3] = leaves[1][2];
              gameboard[6][x * 3 + 1] = leaves[2][0];
              gameboard[6][x * 3 + 2] = leaves[2][1];
              gameboard[6][x * 3 + 3] = leaves[2][2];
            }
            else {
              gameboard[1][x * 3 + 1] = leaves[0][0];
              gameboard[1][x * 3 + 2] = leaves[0][1];
              gameboard[1][x * 3 + 3] = leaves[0][2];
              gameboard[2][x * 3 + 1] = leaves[1][0];
              gameboard[2][x * 3 + 2] = leaves[1][1];
              gameboard[2][x * 3 + 3] = leaves[1][2];
              gameboard[3][x * 3 + 1] = leaves[2][0];
              gameboard[3][x * 3 + 2] = leaves[2][1];
              gameboard[3][x * 3 + 3] = leaves[2][2];
            }
          }
          else if (blocks.get(xx).get(yy).equalsIgnoreCase("emerald")) {
            if (y == 0) {
              gameboard[16][x * 3 + 1] = emeralds[0][0];
              gameboard[16][x * 3 + 2] = emeralds[0][1];
              gameboard[16][x * 3 + 3] = emeralds[0][2];
              gameboard[17][x * 3 + 1] = emeralds[1][0];
              gameboard[17][x * 3 + 2] = emeralds[1][1];
              gameboard[17][x * 3 + 3] = emeralds[1][2];
              gameboard[18][x * 3 + 1] = emeralds[2][0];
              gameboard[18][x * 3 + 2] = emeralds[2][1];
              gameboard[18][x * 3 + 3] = emeralds[2][2];
            }
            else if (y == 1) {
              gameboard[13][x * 3 + 1] = emeralds[0][0];
              gameboard[13][x * 3 + 2] = emeralds[0][1];
              gameboard[13][x * 3 + 3] = emeralds[0][2];
              gameboard[14][x * 3 + 1] = emeralds[1][0];
              gameboard[14][x * 3 + 2] = emeralds[1][1];
              gameboard[14][x * 3 + 3] = emeralds[1][2];
              gameboard[15][x * 3 + 1] = emeralds[2][0];
              gameboard[15][x * 3 + 2] = emeralds[2][1];
              gameboard[15][x * 3 + 3] = emeralds[2][2];
            }
            else if (y == 2) {
              gameboard[10][x * 3 + 1] = emeralds[0][0];
              gameboard[10][x * 3 + 2] = emeralds[0][1];
              gameboard[10][x * 3 + 3] = emeralds[0][2];
              gameboard[11][x * 3 + 1] = emeralds[1][0];
              gameboard[11][x * 3 + 2] = emeralds[1][1];
              gameboard[11][x * 3 + 3] = emeralds[1][2];
              gameboard[12][x * 3 + 1] = emeralds[2][0];
              gameboard[12][x * 3 + 2] = emeralds[2][1];
              gameboard[12][x * 3 + 3] = emeralds[2][2];
            }
            else if (y == 3) {
              gameboard[7][x * 3 + 1] = emeralds[0][0];
              gameboard[7][x * 3 + 2] = emeralds[0][1];
              gameboard[7][x * 3 + 3] = emeralds[0][2];
              gameboard[8][x * 3 + 1] = emeralds[1][0];
              gameboard[8][x * 3 + 2] = emeralds[1][1];
              gameboard[8][x * 3 + 3] = emeralds[1][2];
              gameboard[9][x * 3 + 1] = emeralds[2][0];
              gameboard[9][x * 3 + 2] = emeralds[2][1];
              gameboard[9][x * 3 + 3] = emeralds[2][2];
            }
            else if (y == 4) {
              gameboard[4][x * 3 + 1] = emeralds[0][0];
              gameboard[4][x * 3 + 2] = emeralds[0][1];
              gameboard[4][x * 3 + 3] = emeralds[0][2];
              gameboard[5][x * 3 + 1] = emeralds[1][0];
              gameboard[5][x * 3 + 2] = emeralds[1][1];
              gameboard[5][x * 3 + 3] = emeralds[1][2];
              gameboard[6][x * 3 + 1] = emeralds[2][0];
              gameboard[6][x * 3 + 2] = emeralds[2][1];
              gameboard[6][x * 3 + 3] = emeralds[2][2];
            }
            else {
              gameboard[1][x * 3 + 1] = emeralds[0][0];
              gameboard[1][x * 3 + 2] = emeralds[0][1];
              gameboard[1][x * 3 + 3] = emeralds[0][2];
              gameboard[2][x * 3 + 1] = emeralds[1][0];
              gameboard[2][x * 3 + 2] = emeralds[1][1];
              gameboard[2][x * 3 + 3] = emeralds[1][2];
              gameboard[3][x * 3 + 1] = emeralds[2][0];
              gameboard[3][x * 3 + 2] = emeralds[2][1];
              gameboard[3][x * 3 + 3] = emeralds[2][2];
            }
          }
          else if (blocks.get(xx).get(yy).equalsIgnoreCase("ruby")) {
            if (y == 0) {
              gameboard[16][x * 3 + 1] = rubies[0][0];
              gameboard[16][x * 3 + 2] = rubies[0][1];
              gameboard[16][x * 3 + 3] = rubies[0][2];
              gameboard[17][x * 3 + 1] = rubies[1][0];
              gameboard[17][x * 3 + 2] = rubies[1][1];
              gameboard[17][x * 3 + 3] = rubies[1][2];
              gameboard[18][x * 3 + 1] = rubies[2][0];
              gameboard[18][x * 3 + 2] = rubies[2][1];
              gameboard[18][x * 3 + 3] = rubies[2][2];
            }
            else if (y == 1) {
              gameboard[13][x * 3 + 1] = rubies[0][0];
              gameboard[13][x * 3 + 2] = rubies[0][1];
              gameboard[13][x * 3 + 3] = rubies[0][2];
              gameboard[14][x * 3 + 1] = rubies[1][0];
              gameboard[14][x * 3 + 2] = rubies[1][1];
              gameboard[14][x * 3 + 3] = rubies[1][2];
              gameboard[15][x * 3 + 1] = rubies[2][0];
              gameboard[15][x * 3 + 2] = rubies[2][1];
              gameboard[15][x * 3 + 3] = rubies[2][2];
            }
            else if (y == 2) {
              gameboard[10][x * 3 + 1] = rubies[0][0];
              gameboard[10][x * 3 + 2] = rubies[0][1];
              gameboard[10][x * 3 + 3] = rubies[0][2];
              gameboard[11][x * 3 + 1] = rubies[1][0];
              gameboard[11][x * 3 + 2] = rubies[1][1];
              gameboard[11][x * 3 + 3] = rubies[1][2];
              gameboard[12][x * 3 + 1] = rubies[2][0];
              gameboard[12][x * 3 + 2] = rubies[2][1];
              gameboard[12][x * 3 + 3] = rubies[2][2];
            }
            else if (y == 3) {
              gameboard[7][x * 3 + 1] = rubies[0][0];
              gameboard[7][x * 3 + 2] = rubies[0][1];
              gameboard[7][x * 3 + 3] = rubies[0][2];
              gameboard[8][x * 3 + 1] = rubies[1][0];
              gameboard[8][x * 3 + 2] = rubies[1][1];
              gameboard[8][x * 3 + 3] = rubies[1][2];
              gameboard[9][x * 3 + 1] = rubies[2][0];
              gameboard[9][x * 3 + 2] = rubies[2][1];
              gameboard[9][x * 3 + 3] = rubies[2][2];
            }
            else if (y == 4) {
              gameboard[4][x * 3 + 1] = rubies[0][0];
              gameboard[4][x * 3 + 2] = rubies[0][1];
              gameboard[4][x * 3 + 3] = rubies[0][2];
              gameboard[5][x * 3 + 1] = rubies[1][0];
              gameboard[5][x * 3 + 2] = rubies[1][1];
              gameboard[5][x * 3 + 3] = rubies[1][2];
              gameboard[6][x * 3 + 1] = rubies[2][0];
              gameboard[6][x * 3 + 2] = rubies[2][1];
              gameboard[6][x * 3 + 3] = rubies[2][2];
            }
            else {
              gameboard[1][x * 3 + 1] = rubies[0][0];
              gameboard[1][x * 3 + 2] = rubies[0][1];
              gameboard[1][x * 3 + 3] = rubies[0][2];
              gameboard[2][x * 3 + 1] = rubies[1][0];
              gameboard[2][x * 3 + 2] = rubies[1][1];
              gameboard[2][x * 3 + 3] = rubies[1][2];
              gameboard[3][x * 3 + 1] = rubies[2][0];
              gameboard[3][x * 3 + 2] = rubies[2][1];
              gameboard[3][x * 3 + 3] = rubies[2][2];
            }
          }
          else if (blocks.get(xx).get(yy).equalsIgnoreCase("coal")) {
            if (y == 0) {
              gameboard[16][x * 3 + 1] = coal[0][0];
              gameboard[16][x * 3 + 2] = coal[0][1];
              gameboard[16][x * 3 + 3] = coal[0][2];
              gameboard[17][x * 3 + 1] = coal[1][0];
              gameboard[17][x * 3 + 2] = coal[1][1];
              gameboard[17][x * 3 + 3] = coal[1][2];
              gameboard[18][x * 3 + 1] = coal[2][0];
              gameboard[18][x * 3 + 2] = coal[2][1];
              gameboard[18][x * 3 + 3] = coal[2][2];
            }
            else if (y == 1) {
              gameboard[13][x * 3 + 1] = coal[0][0];
              gameboard[13][x * 3 + 2] = coal[0][1];
              gameboard[13][x * 3 + 3] = coal[0][2];
              gameboard[14][x * 3 + 1] = coal[1][0];
              gameboard[14][x * 3 + 2] = coal[1][1];
              gameboard[14][x * 3 + 3] = coal[1][2];
              gameboard[15][x * 3 + 1] = coal[2][0];
              gameboard[15][x * 3 + 2] = coal[2][1];
              gameboard[15][x * 3 + 3] = coal[2][2];
            }
            else if (y == 2) {
              gameboard[10][x * 3 + 1] = coal[0][0];
              gameboard[10][x * 3 + 2] = coal[0][1];
              gameboard[10][x * 3 + 3] = coal[0][2];
              gameboard[11][x * 3 + 1] = coal[1][0];
              gameboard[11][x * 3 + 2] = coal[1][1];
              gameboard[11][x * 3 + 3] = coal[1][2];
              gameboard[12][x * 3 + 1] = coal[2][0];
              gameboard[12][x * 3 + 2] = coal[2][1];
              gameboard[12][x * 3 + 3] = coal[2][2];
            }
            else if (y == 3) {
              gameboard[7][x * 3 + 1] = coal[0][0];
              gameboard[7][x * 3 + 2] = coal[0][1];
              gameboard[7][x * 3 + 3] = coal[0][2];
              gameboard[8][x * 3 + 1] = coal[1][0];
              gameboard[8][x * 3 + 2] = coal[1][1];
              gameboard[8][x * 3 + 3] = coal[1][2];
              gameboard[9][x * 3 + 1] = coal[2][0];
              gameboard[9][x * 3 + 2] = coal[2][1];
              gameboard[9][x * 3 + 3] = coal[2][2];
            }
            else if (y == 4) {
              gameboard[4][x * 3 + 1] = coal[0][0];
              gameboard[4][x * 3 + 2] = coal[0][1];
              gameboard[4][x * 3 + 3] = coal[0][2];
              gameboard[5][x * 3 + 1] = coal[1][0];
              gameboard[5][x * 3 + 2] = coal[1][1];
              gameboard[5][x * 3 + 3] = coal[1][2];
              gameboard[6][x * 3 + 1] = coal[2][0];
              gameboard[6][x * 3 + 2] = coal[2][1];
              gameboard[6][x * 3 + 3] = coal[2][2];
            }
            else {
              gameboard[1][x * 3 + 1] = coal[0][0];
              gameboard[1][x * 3 + 2] = coal[0][1];
              gameboard[1][x * 3 + 3] = coal[0][2];
              gameboard[2][x * 3 + 1] = coal[1][0];
              gameboard[2][x * 3 + 2] = coal[1][1];
              gameboard[2][x * 3 + 3] = coal[1][2];
              gameboard[3][x * 3 + 1] = coal[2][0];
              gameboard[3][x * 3 + 2] = coal[2][1];
              gameboard[3][x * 3 + 3] = coal[2][2];
            }
          }
          else {

          }
      }
    }
    return gameboard;
  }
}
