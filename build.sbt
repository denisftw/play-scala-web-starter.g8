enablePlugins(Giter8Plugin)

resolvers += Resolver.url("typesafe", url("https://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)

scriptedBufferLog in (Test, g8) := false
