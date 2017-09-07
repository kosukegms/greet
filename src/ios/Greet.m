#import "Greet.h"

@implementation Greet

- (void) sayHi:(CDVInvokedUrlCommand *) command {

  NSString* name = [[command arguments] objectAtIndex:0];
    NSString* message = [NSString stringWithFormat:@"Hi, %@", name];

  CDVPluginResult* result = [CDVPluginResult
                            resultWithStatus:CDVCommandStatus_OK
                            messageAsString:message];
  [self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
}

@end
