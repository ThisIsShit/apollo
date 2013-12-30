require 'java'
java_import 'org.apollo.game.model.Animation'
java_import 'org.apollo.game.model.World'

on :command, :hello do |player, command|
  player.play_animation Animation::WAVE
  player.send_message("Hello, World!")
end
