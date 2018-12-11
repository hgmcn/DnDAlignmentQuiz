package com.dnd.hgmcn.dndalignmentquiz2;

import com.spotify.android.appremote.api.ConnectionParams;
import com.spotify.android.appremote.api.Connector;
import com.spotify.android.appremote.api.SpotifyAppRemote;

import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.types.PlayerState;
import com.spotify.protocol.types.Track;

public class QuizMechanics {
    public static String[] questions = {
            "Duck, goose, or chicken?",
            "Wholesome memes, edgy memes, or none?",
            "iClicker, Kahoot, or Jeopardy?",
            "Have you ever worn Crocs?",
            "Myers-Briggs or Horoscopes?",
            "What's your video game style?",
            "Are you a cowboy?",
            "What's your favorite card/board game?",
            "Pick a smiley face.",
            "Which type of chair is best?",
            "Pick a movie.",
            "Which vegetable is superior?",
            "Do you like venn diagrams?",
            "Pick a second layer.",
            "Which number speaks to you the most?",
            "And now, the weather:",
            "How old are you?",
            "Pick a video game genre.",
            "Say hello.",
            "When you bump into someone, what do you say?",
            "Does BDE hold any meaning to you?",
            "Which gaming platform do you prefer?",
            "Pick a kind of waste.",
            "When do you shower?",
            "Which earth is best?",
            "What do you call a bag that you wear on your back?",
            "Scream.",
            "What would you do if you found a squirrel at home?",
            "Pick an animal with antlers.",
            "What kind of phone do you have?"
    };
    public static String[][] choices = {
            {"Duck", "Goose", "Chicken"},
            {"Wholesome", "Edgy", "None"},
            {"iClicker", "Kahoot", "Jeopardy"},
            {"No", "Yes", "Yes (Regretfully)"},
            {"Myers-Briggs", "Horoscopes", "Neither"},
            {"Completionist", "Speed-Run", "Cheating"},
            {"Yee-haw", "Yee-naw", "Yee-wah"},
            {"Scrabble", "CAH", "Catan"},
            {":)", ";P", ":3"},
            {"Spinning", "Rocking", "Cozy"},
            {"Shrek", "Emoji Movie", "Neither"},
            {"Cabbage", "Lettuce", "Spinach"},
            {"Yes", "No", "Kinda"},
            {"Hoodie", "Sweater", "Jacket"},
            {"69", "420", "666"},
            {"Storming", "Sunny", "Snowing"},
            {"0-15", "16-35", "36+"},
            {"RPG", "FPS", "MMO"},
            {"Howdy", "Hey Y'all", "Hewwo"},
            {"Ope", "Oops", "Whoops"},
            {":(", ":)", "?????"},
            {"Playstation", "Xbox", "PC"},
            {"Trash", "Recycling", "Compost"},
            {"Morning", "Night", "Never"},
            {"Flat", "Spherical", "Polyhedral"},
            {"Backpack", "Knapsack", "Book Bag"},
            {"Ahhhhhhh", "Aaaaaaah", "Aaaahhhh"},
            {"Keep It", "Chase It Away", "Feed It"},
            {"Moose", "Reindeer", "Deer"},
            {"iPhone", "Android", "Windows"}
    };
}
